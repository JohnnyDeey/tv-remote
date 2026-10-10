import asyncio
import re
import json
import subprocess
import websockets
import socket

PORT = 8765
launched_apps = []
ADB = ["/data/data/com.termux/files/usr/bin/adb", "-s", "localhost:5555", "shell"]

SKIP_PKGS = {"com.android.systemui", "com.android.tv.settings", "com.termux", "com.control.device"}

def real_running_apps():
    # apps with a live task on the decoder, most recent first
    try:
        out = subprocess.run(ADB + ["dumpsys", "activity", "recents"], capture_output=True, text=True, timeout=8).stdout
        alive = set(p.split(":")[0] for p in subprocess.run(ADB + ["ps", "-A", "-o", "NAME"], capture_output=True, text=True, timeout=8).stdout.split())
    except Exception:
        return launched_apps
    apps = []
    for m in re.finditer(r"Recent #\d+: Task\{[^}]*?type=standard A=\d+:([\w.]+)", out):
        pkg = m.group(1)
        if not pkg.startswith(tuple(SKIP_PKGS)) and pkg not in apps and pkg in alive:
            apps.append(pkg)
    return apps

def foreground_pkg():
    # package of the app currently in front, or None
    try:
        out = subprocess.run(ADB + ["dumpsys", "activity", "activities"], capture_output=True, text=True, timeout=8).stdout
    except Exception:
        return None
    m = re.search(r"ResumedActivity: ActivityRecord\{\S+ u\d+ ([\w.]+)/", out)
    return m.group(1) if m else None

def reconnect_adb():
    try:
        subprocess.run(["/data/data/com.termux/files/usr/bin/adb", "connect", "localhost:5555"], timeout=5)
    except:
        pass

async def handler(websocket):
    async for message in websocket:
        try:
            data = json.loads(message)
            action = data.get("action")

            if action == "text":
                text = data.get("text", "")
                # Map special characters to their escaped versions for ADB
                special = {
                    '#': '\\#',
                    '&': '\\&',
                    '*': '\\*',
                    '(': '\\(',
                    ')': '\\)',
                    '?': '\\?',
                    '<': '\\<',
                    '>': '\\>',
                    '|': '\\|',
                    '"': '\\"',
                    "'": "\\'",
                    '!': '\\!',
                    ';': '\\;',
                    '`': '\\`',
                    '$': '\\$',
                    '\\': '\\\\',
                }
                result = ''
                for ch in text:
                    result += special.get(ch, ch)
                result = result.replace(' ', '%s')
                subprocess.run(ADB + ["input", "text", result])

            elif action == "key":
                keycode = data.get("keycode", 0)
                subprocess.run(ADB + ["input", "keyevent", str(keycode)])

            elif action == "ping_tv":
                import subprocess as sp
                result = sp.run(["ping", "-c", "1", "-W", "1", "192.168.68.109"], capture_output=True)
                reachable = result.returncode == 0
                await websocket.send(json.dumps({"status": "ok", "reachable": reachable}))
                continue

            elif action == "hide_keyboard":
                subprocess.run(ADB + ["input", "keyevent", "111"])
                await websocket.send(json.dumps({"status": "ok"}))
                continue

            elif action == "get_apps":
                result = subprocess.run(
                    ADB + ["cmd", "package", "list", "packages", "-3"],
                    capture_output=True, text=True
                )
                packages = [line.replace("package:", "").strip()
                        for line in result.stdout.strip().split("\n")
                        if line.startswith("package:")]
                await websocket.send(json.dumps({"status": "ok", "apps": packages}))
                continue

            elif action == "launch_app":
                package = data.get("package", "")
                subprocess.run(ADB + ["monkey", "-p", package, "-c", "android.intent.category.LAUNCHER", "1"])
                if package and package not in launched_apps:
                    launched_apps.append(package)

            elif action == "save_app_meta":
                pkg = data.get("package", "")
                name = data.get("name", "")
                color = data.get("color", "")
                try:
                    with open("/sdcard/app_meta.json", "r") as f:
                        meta = json.load(f)
                except:
                    meta = {}
                if pkg:
                    meta[pkg] = {"name": name, "color": color}
                with open("/sdcard/app_meta.json", "w") as f:
                    json.dump(meta, f)

            elif action == "get_app_meta":
                try:
                    with open("/sdcard/app_meta.json", "r") as f:
                        meta = json.load(f)
                except:
                    meta = {}
                await websocket.send(json.dumps({"status": "ok", "meta": meta}))
                continue

            elif action == "wol":
                import socket
                mac = "74:24:ca:d7:c6:03"
                mac_bytes = bytes.fromhex(mac.replace(":", ""))
                magic = b'\xff' * 6 + mac_bytes * 16
                sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
                sock.setsockopt(socket.SOL_SOCKET, socket.SO_BROADCAST, 1)
                sock.sendto(magic, ('255.255.255.255', 9))
                sock.sendto(magic, ('192.168.68.255', 9))
                sock.sendto(magic, ('192.168.1.255', 9))
                sock.close()

            elif action == "find_tv":
                warm_arp(websocket.local_address[0])
                await asyncio.sleep(2)
                ip = find_tv_ip()
                await websocket.send(json.dumps({"status": "ok", "ip": ip}))
                continue

            elif action == "get_running_apps":
                await websocket.send(json.dumps({"status": "ok", "running_apps": real_running_apps()}))
                continue

            elif action == "exit_app":
                pkg = data.get("package", "")
                # press Back only while this app is in front; stop as soon as it has closed
                for i in range(5):
                    if foreground_pkg() != pkg:
                        if i == 0:  # not in front: nothing to press Back on, so stop it
                            subprocess.run(ADB + ["am", "force-stop", pkg])
                        break
                    subprocess.run(ADB + ["input", "keyevent", "4"])
                    await asyncio.sleep(0.7)
                if pkg in launched_apps:
                    launched_apps.remove(pkg)

            elif action == "kill_app":
                pkg = data.get("package", "")
                subprocess.run(ADB + ["am", "force-stop", pkg])
                if pkg in launched_apps:
                    launched_apps.remove(pkg)

            elif action == "longpress":
                keycode = data.get("keycode", 0)
                subprocess.run(ADB + ["input", "keyevent", "--longpress", str(keycode)])

            await websocket.send(json.dumps({"status": "ok"}))

        except Exception as e:
            try:
                await websocket.send(json.dumps({"status": "error", "msg": str(e)}))
            except:
                pass

TV_MAC = "74:24:ca:d7:c6:03"

def warm_arp(local_ip):
    # send a tiny packet to every address on our subnet so the decoder
    # learns which devices are there (fills the 'ip neigh' table)
    prefix = local_ip.rsplit('.', 1)[0]
    s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    s.setblocking(False)
    for i in range(1, 255):
        try:
            s.sendto(b'x', (f"{prefix}.{i}", 9))
        except Exception:
            pass
    s.close()

def find_tv_ip():
    try:
        result = subprocess.run(
            ['/data/data/com.termux/files/usr/bin/adb', '-s', 'localhost:5555', 'shell', 'ip neigh'],
            capture_output=True, text=True
        )
        for line in result.stdout.splitlines():
            if TV_MAC in line.lower():
                return line.split()[0]
    except:
        pass
    return None

async def keep_wss_alive():
    pass  # Removed — phone handles TV connection directly

async def keep_adb_alive():
    while True:
        try:
            result = subprocess.run(ADB + ["echo", "ok"], capture_output=True, text=True, timeout=5)
            if "ok" not in result.stdout:
                reconnect_adb()
        except:
            reconnect_adb()
        await asyncio.sleep(30)

async def main():
    async with websockets.serve(handler, "0.0.0.0", PORT):
        asyncio.create_task(keep_adb_alive())
        await asyncio.Future()

asyncio.run(main())
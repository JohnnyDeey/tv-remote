import asyncio
import json
import subprocess
import websockets

PORT = 8765
ADB = ["/data/data/com.termux/files/usr/bin/adb", "-s", "localhost:5555", "shell"]

async def handler(websocket):
    async for message in websocket:
        try:
            data = json.loads(message)
            action = data.get("action")

            if action == "text":
                text = data.get("text", "")
                text = text.replace(" ", "%s")
                subprocess.run(ADB + ["input", "text", text])

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

            elif action == "longpress":
                keycode = data.get("keycode", 0)
                subprocess.run(ADB + ["input", "keyevent", "--longpress", str(keycode)])

            await websocket.send(json.dumps({"status": "ok"}))

        except Exception as e:
            try:
                await websocket.send(json.dumps({"status": "error", "msg": str(e)}))
            except:
                pass

async def keep_wss_alive():
    import ssl
    ssl_ctx = ssl.SSLContext(ssl.PROTOCOL_TLS_CLIENT)
    ssl_ctx.check_hostname = False
    ssl_ctx.verify_mode = ssl.CERT_NONE
    TV_IP = "192.168.68.109"
    uri = f'wss://{TV_IP}:8002/api/v2/channels/samsung.remote.control?name=a2VlcGFsaXZl'
    while True:
        try:
            async with websockets.connect(uri, ssl=ssl_ctx) as tv_ws:
                print("TV WSS keep-alive connected")
                while True:
                    await asyncio.sleep(5)
                    await tv_ws.ping()
        except Exception as e:
            await asyncio.sleep(3)

async def main():
    async with websockets.serve(handler, "0.0.0.0", PORT):
        asyncio.create_task(keep_wss_alive())
        await asyncio.Future()

asyncio.run(main())
import asyncio
import json
import subprocess
import websockets

ADB = r"C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe"
DECODER = "192.168.68.100:5555"
PORT = 8765

def adb(cmd):
    full = [ADB, "-s", DECODER] + cmd
    result = subprocess.run(full, capture_output=True, text=True)
    return result.stdout.strip()

# Android key codes
KEYS = {
    "up": 19, "down": 20, "left": 21, "right": 22,
    "ok": 23, "back": 4, "home": 3, "menu": 82,
    "power": 26, "vol_up": 24, "vol_down": 25, "mute": 164,
    "del": 67
}

async def handler(websocket):
    print("Phone connected")
    async for message in websocket:
        try:
            data = json.loads(message)
            action = data.get("action")

            if action == "text":
                text = data.get("text", "")
                text = text.replace("'", "\\'").replace(" ", "%s")
                adb(["shell", "input", "text", text])
                print(f"Typed: {text}")

            elif action == "key":
                key = data.get("key", "")
                code = KEYS.get(key)
                if code:
                    adb(["shell", "input", "keyevent", str(code)])
                    print(f"Key: {key} ({code})")

            await websocket.send(json.dumps({"status": "ok"}))

        except Exception as e:
            print(f"Error: {e}")

async def main():
    print(f"✓ Bridge running on ws://localhost:{PORT}")
    print(f"  Decoder: {DECODER}")
    async with websockets.serve(handler, "0.0.0.0", PORT):
        await asyncio.Future()

asyncio.run(main())
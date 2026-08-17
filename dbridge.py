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

            elif action == "longpress":
                keycode = data.get("keycode", 0)
                subprocess.run(ADB + ["input", "keyevent", "--longpress", str(keycode)])

            await websocket.send(json.dumps({"status": "ok"}))

        except Exception as e:
            await websocket.send(json.dumps({"status": "error", "msg": str(e)}))

async def main():
    async with websockets.serve(handler, "0.0.0.0", PORT):
        await asyncio.Future()

asyncio.run(main())
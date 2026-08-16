import asyncio
import json
import subprocess
import websockets

PORT = 8766
ADB = ["/data/data/com.termux/files/usr/bin/adb", "-s", "emulator-5554", "shell"]
SCREEN_W = 1920
SCREEN_H = 1080
cur_x = SCREEN_W // 2
cur_y = SCREEN_H // 2

async def handler(websocket):
    global cur_x, cur_y
    async for message in websocket:
        try:
            data = json.loads(message)
            action = data.get("action")

            if action == "mouse_move":
                dx = data.get("dx", 0)
                dy = data.get("dy", 0)
                new_x = max(0, min(SCREEN_W, cur_x + dx))
                new_y = max(0, min(SCREEN_H, cur_y + dy))
                subprocess.run(ADB + ["input", "mouse", "motionevent", "MOVE",
                    str(int(new_x)), str(int(new_y))])
                cur_x = new_x
                cur_y = new_y

            elif action == "mouse_tap":
                subprocess.run(ADB + ["input", "mouse", "motionevent", "DOWN",
                    str(int(cur_x)), str(int(cur_y))])
                subprocess.run(ADB + ["input", "mouse", "motionevent", "UP",
                    str(int(cur_x)), str(int(cur_y))])

            await websocket.send(json.dumps({"status": "ok"}))

        except Exception as e:
            await websocket.send(json.dumps({"status": "error"}))

async def main():
    async with websockets.serve(handler, "0.0.0.0", PORT):
        await asyncio.Future()

asyncio.run(main())
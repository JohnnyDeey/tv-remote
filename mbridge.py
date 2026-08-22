import asyncio
import json
import subprocess
import websockets
import time

PORT = 8766
DECODER_IP = "192.168.68.107"
DECODER_PORT = "5555"
ADB = r"C:\Users\johndamilola.s\AppData\Local\Android\Sdk\platform-tools\adb.exe"
SCREEN_W = 1920
SCREEN_H = 1080
cur_x = SCREEN_W // 2
cur_y = SCREEN_H // 2
is_down = False

def adb(args):
    subprocess.run([ADB, "-s", f"{DECODER_IP}:{DECODER_PORT}", "shell"] + args, timeout=5)

def connect():
    subprocess.run([ADB, "connect", f"{DECODER_IP}:{DECODER_PORT}"], timeout=5)

async def handler(websocket):
    global cur_x, cur_y, is_down
    async for message in websocket:
        try:
            data = json.loads(message)
            action = data.get("action")

            if action == "open":
                # Just enable overlay - no click
                cur_x = SCREEN_W // 2
                cur_y = SCREEN_H // 2
                is_down = False
                adb(["settings", "put", "system", "pointer_location", "1"])

            elif action == "close":
                # Release if still down, then disable overlay
                if is_down:
                    adb(["input", "mouse", "motionevent", "UP", str(cur_x), str(cur_y)])
                    is_down = False
                adb(["settings", "put", "system", "pointer_location", "0"])

            elif action == "move":
                dx = int(data.get("dx", 0))
                dy = int(data.get("dy", 0))
                new_x = max(0, min(SCREEN_W, cur_x + dx))
                new_y = max(0, min(SCREEN_H, cur_y + dy))
                if not is_down:
                    adb(["input", "mouse", "motionevent", "DOWN", str(cur_x), str(cur_y)])
                    is_down = True
                adb(["input", "mouse", "motionevent", "MOVE", str(new_x), str(new_y)])
                cur_x = new_x
                cur_y = new_y

            elif action == "move_end":
                # Finger lifted from trackpad - release mouse button
                if is_down:
                    adb(["input", "mouse", "motionevent", "UP", str(cur_x), str(cur_y)])
                    is_down = False

            elif action == "tap":
                # Left click at current position
                if is_down:
                    adb(["input", "mouse", "motionevent", "UP", str(cur_x), str(cur_y)])
                    is_down = False
                adb(["input", "mouse", "motionevent", "DOWN", str(cur_x), str(cur_y)])
                adb(["input", "mouse", "motionevent", "UP", str(cur_x), str(cur_y)])

            elif action == "tap_right":
                # Long press for right click
                if is_down:
                    adb(["input", "mouse", "motionevent", "UP", str(cur_x), str(cur_y)])
                    is_down = False
                adb(["input", "mouse", "motionevent", "DOWN", str(cur_x), str(cur_y)])
                time.sleep(0.8)
                adb(["input", "mouse", "motionevent", "UP", str(cur_x), str(cur_y)])

            elif action == "scroll":
                dy = int(data.get("dy", 0))
                end_y = max(0, min(SCREEN_H, cur_y - dy * 5))
                if is_down:
                    adb(["input", "mouse", "motionevent", "UP", str(cur_x), str(cur_y)])
                    is_down = False
                adb(["input", "touchscreen", "swipe",
                     str(cur_x), str(cur_y), str(cur_x), str(end_y), "300"])

            elif action == "reset":
                if is_down:
                    adb(["input", "mouse", "motionevent", "UP", str(cur_x), str(cur_y)])
                    is_down = False
                cur_x = SCREEN_W // 2
                cur_y = SCREEN_H // 2

            await websocket.send(json.dumps({"status": "ok", "x": cur_x, "y": cur_y}))

        except Exception as e:
            await websocket.send(json.dumps({"status": "error", "msg": str(e)}))

async def main():
    connect()
    print(f"Connected to decoder at {DECODER_IP}:{DECODER_PORT}")
    async with websockets.serve(handler, "0.0.0.0", PORT):
        print(f"Mouse bridge running on port {PORT}")
        print(f"Connect your app to ws://192.168.68.103:{PORT}")
        await asyncio.Future()

asyncio.run(main())



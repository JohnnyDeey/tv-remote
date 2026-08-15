import asyncio
import websockets
import json

async def test():
    async with websockets.connect('ws://192.168.68.111:8765') as ws:
        await ws.send(json.dumps({'action': 'text', 'text': 'test'}))
        response = await ws.recv()
        print("Response:", response)

asyncio.run(test())
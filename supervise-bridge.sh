#!/data/data/com.termux/files/usr/bin/bash
# keeps dbridge.py running and restarts it whenever /sdcard/dbridge.py changes
termux-wake-lock
while true; do
  python /sdcard/dbridge.py &
  PID=$!
  H=$(md5sum /sdcard/dbridge.py | cut -d' ' -f1)
  while kill -0 $PID 2>/dev/null; do
    sleep 3
    N=$(md5sum /sdcard/dbridge.py | cut -d' ' -f1)
    if [ "$N" != "$H" ]; then kill $PID; break; fi
  done
  sleep 1
done
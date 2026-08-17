@echo off
echo Connecting to decoder...
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe connect 192.168.68.100:5555
timeout /t 2
echo Killing existing bridge...
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "am force-stop com.termux"
timeout /t 2
echo Starting Termux...
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "am start -n com.termux/.app.TermuxActivity"
timeout /t 3
echo Connecting ADB localhost...
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input text '/data/data/com.termux/files/usr/bin/adb'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input keyevent 62"
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input text 'connect'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input keyevent 62"
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input text 'localhost:5555'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input keyevent 66"
timeout /t 3
echo Starting bridge...
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input text 'python'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input keyevent 62"
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input text '/sdcard/dbridge.py'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input keyevent 66"
timeout /t 2
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input text 'python%s/sdcard/mbridge.py%s&'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s 192.168.68.100:5555 shell "input keyevent 66"
echo Bridge started!
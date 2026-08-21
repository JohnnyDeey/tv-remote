@echo off
echo Discovering decoder...

:: Try common IPs
set DECODER_IP=
for %%i in (192.168.68.107 192.168.68.100 192.168.1.100 192.168.1.107) do (
    C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe connect %%i:5555 2>nul | find "connected" >nul
    if not errorlevel 1 (
        set DECODER_IP=%%i
        goto :found
    )
)

:: Scan full subnet if not found
for /L %%i in (1,1,254) do (
    C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe connect 192.168.68.%%i:5555 2>nul | find "connected" >nul
    if not errorlevel 1 (
        set DECODER_IP=192.168.68.%%i
        goto :found
    )
)

echo Decoder not found!
pause
exit

:found
echo Decoder found at %DECODER_IP%
timeout /t 2
echo Killing existing bridge...
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "am force-stop com.termux"
timeout /t 2
echo Starting Termux...
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "am start -n com.termux/.app.TermuxActivity"
timeout /t 3
echo Connecting ADB localhost...
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input text '/data/data/com.termux/files/usr/bin/adb'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input keyevent 62"
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input text 'connect'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input keyevent 62"
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input text 'localhost:5555'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input keyevent 66"
timeout /t 3
echo Starting bridge...
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input text 'python'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input keyevent 62"
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input text '/sdcard/dbridge.py'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input keyevent 66"
timeout /t 2
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input text 'python%s/sdcard/mbridge.py%s&'"
timeout /t 1
C:\Users\johndamilola.s\AppData\Roaming\Python\Python313\site-packages\adbutils\binaries\adb.exe -s %DECODER_IP%:5555 shell "input keyevent 66"
echo Bridge started at %DECODER_IP%!
pause
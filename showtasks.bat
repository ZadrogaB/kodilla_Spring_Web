call runcrud
if "%ERRORLEVEL%" == "0" goto openBrowser
echo.
echo runcrud has errors – breaking work
goto fail

:openBrowser
echo Opening Firefox
if exist "C:\Program Files\Mozilla Firefox\firefox.exe" start "C:\Program Files\Mozilla Firefox\firefox.exe" "http://localhost:8080/crud/v1/task/getTasks"
goto end

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished.
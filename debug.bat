@echo off
rem This file runs the corresponded demo.

if "%OS%" == "Windows_NT" setlocal
set APP=sonic
set EMULATOR=%WTK_HOME%\bin\emulator

rem Run a WTK with the specified demo.
%EMULATOR% -classpath classes;res -Xdebug -Xrunjdwp:transport=dt_socket,address=4711,server=y Sonic 

:end
if "%OS%" == "Windows_NT" endlocal

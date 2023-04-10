@echo off
rem This file runs the corresponded demo.

if "%OS%" == "Windows_NT" setlocal
set APP=sonic
set EMULATOR=%WTK_HOME%\bin\emulator

if not exist .\%APP%.jad (
  echo *** Run this batch file from its location directory only. ***
  goto end
)

if not exist .\%APP%.jar (
  echo *** You should build the %APP%.jar first. ***
  goto end
)

rem Run a WTK with the specified demo.
%EMULATOR% -Xdescriptor:%APP%.jad

:end
if "%OS%" == "Windows_NT" endlocal

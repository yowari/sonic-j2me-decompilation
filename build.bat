@echo off
rem
rem This batch file builds and preverifies the code for the demos.
rem it then packages them in a JAR file appropriately.
rem
if "%OS%" == "Windows_NT" setlocal
set APP=sonic
set CLDCAPI=%WTK_HOME%\lib\cldcapi10.jar
set MIDPAPI=%WTK_HOME%\lib\midpapi20.jar
set PREVERIFY=%WTK_HOME%\bin\preverify

set SOURCES_FOLDER=src
set RESOURCES_FOLDER=res
set BUILD_FOLDER=tmpclasses
set PREVERIFY_FOLDER=classes

set JAVA_FILES=
set JAVA_FILES=%JAVA_FILES% src\*.java

set JAVAC=javac
set JAR=jar

if not "%JAVA_HOME%" == "" (
    set JAVAC="%JAVA_HOME%\bin\javac"
    set JAR="%JAVA_HOME%\bin\jar"
)

if not "%JAVA_HOME_8%" == "" (
    set JAVAC="%JAVA_HOME_8%\bin\javac"
    set JAR="%JAVA_HOME_8%\bin\jar"
)

if not exist .\%APP%.jad (
  echo *** Run this batch file from its location directory only. ***
  goto end
)

echo *** Creating directories ***
if not exist %BUILD_FOLDER% md %BUILD_FOLDER%
if not exist %PREVERIFY_FOLDER% md %PREVERIFY_FOLDER%

echo *** Compiling source files ***
%JAVAC% -bootclasspath %CLDCAPI%;%MIDPAPI% -source 1.3 -target 1.3 -d %BUILD_FOLDER% -classpath %BUILD_FOLDER% %JAVA_FILES%

echo *** Preverifying class files ***

rem WARNING: When running under windows 9x the JAR may be incomplete
rem due to a bug in windows 98. Simply place a pause statement between
rem the preverify and JAR stages and wait 5 seconds before continuing
rem the build.

%PREVERIFY% -classpath %CLDCAPI%;%MIDPAPI%;%BUILD_FOLDER% -d %PREVERIFY_FOLDER% %BUILD_FOLDER%

echo *** Jaring preverified class files ***
%JAR% cmf MANIFEST.MF %APP%.jar -C %PREVERIFY_FOLDER% .

if exist .\%RESOURCES_FOLDER% (
    echo *** Jaring resource files ***
    %JAR% uf %APP%.jar -C %RESOURCES_FOLDER% .
)

echo ***
echo *** Don't forget to update the JAR file size in the JAD file!!! ***
echo ***

:end
if "%OS%" == "Windows_NT" endlocal

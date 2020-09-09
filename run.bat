@echo off
set jarName=BuyCraft-1.0-SNAPSHOT-jar-with-dependencies.jar
echo.
echo Building using 'mvn clean compile assembly:single'...
echo.
cmd.exe /c mvn clean compile assembly:single
echo.
echo Running using 'java -jar %jarName%'
echo.
cd target
java -jar %jarName%
echo.
echo EXIT with code %errorlevel%
echo.
echo Press any [key] to exit.
pause > nul
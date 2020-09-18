@echo off
set countScript=counter.js
set jarName=BuyCraft-1.0-SNAPSHOT-jar-with-dependencies.jar
echo.
echo Running BuildCounter using 'node %countScript%'
echo.
node %countScript%
echo.
echo Building using 'mvn clean compile assembly:single'...
echo.
cmd /c mvn clean compile assembly:single
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
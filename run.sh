#! /bin/bash
# Build and Run
echo "Building using 'mvn clean compile assembly:single'"
mvn clean compile assembly:single
echo "Running using java -jar BuyCraft-1.0-SNAPSHOT-jar-with-dependencies.jar"
java -jar BuyCraft-1.0-SNAPSHOT-jar-with-dependencies.jar
echo "Finished!"

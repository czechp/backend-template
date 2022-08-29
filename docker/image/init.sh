#!/bin/bash 
GIT_REPO=https://github.com/czechp/backend-template.git
git clone $GIT_REPO /JavaProject
cd JavaProject
mvn clean install package -DskipTests
java -jar /JavaProject/core/target/core-0.0.1-SNAPSHOT.jar

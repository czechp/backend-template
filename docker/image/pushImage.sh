#!/usr/bin/bash
PROJECT_IMAGE_NAME=$(cat imageName.txt)
sudo docker image push $PROJECT_IMAGE_NAME

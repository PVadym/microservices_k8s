#!/bin/bash

# for example to build and push to docker hub
# ./deploy/build_and_push.sh pet-api 1.0.0

cp deploy/Dockerfile $1/Dockerfile
cd $1

./mvnw clean install

docker build .  --build-arg JAR_FILE=target/$1.jar -t pylypchenko/$1:$2
docker push  pylypchenko/$1:$2

rm Dockerfile


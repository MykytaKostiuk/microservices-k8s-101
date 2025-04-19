#!/usr/bin/env bash

function build_songs_service() {
  cd ../songs-service/ || exit
  gradle clean build
  eval $(minikube docker-env) && \
  docker build -t microservices-k8s/songs-service:1.0.2 ./
}

function resources_service() {
  cd ../resources-service/ || exit
  gradle clean build
  eval $(minikube docker-env) && \
  docker build -t microservices-k8s/resources-service:1.0.2 ./
}

function print_images() {
    docker images | grep 'microservices-k8s'
}

build_songs_service
resources_service
print_images

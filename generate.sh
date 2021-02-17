#!/bin/sh

sudo rm -Rf ./generate/code

docker run --rm -v ${PWD}/generate:/local openapitools/openapi-generator-cli:v4.3.1 generate \
    -i /local/ilg2-0-8.json \
    -g spring \
    -o /local/code \
    -c /local/generate-config.yml

sudo chmod 777 -R ./generate

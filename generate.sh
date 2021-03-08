#!/bin/sh

sudo rm -Rf ./generate/code

#wget -O ./generate/ilg-current.json https://webservice.infolegale.fr/v2/docs/api/api.json

docker run --rm -v ${PWD}/generate:/local openapitools/openapi-generator-cli:v4.3.1 generate \
    -i /local/ilg2-2-7.json \
    -g spring \
    -o /local/code \
    -c /local/generate-config.yml \
    --skip-validate-spec

sudo chmod 777 -R ./generate

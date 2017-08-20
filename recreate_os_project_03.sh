#!/usr/bin/env bash

set -e


cat web-ui/Dockerfile | sed 's/target\/app\.jar/app\.jar/g' | oc new-build --name web-ui -D -

mvn clean install

oc start-build web-ui --from-file web-ui/target/app.jar
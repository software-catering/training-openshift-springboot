#!/usr/bin/env bash

set -e

cat web-ui/Dockerfile | sed 's/target\/app\.jar/app\.jar/g' | oc new-build --name admin-ui -D -

oc start-build admin-ui --from-file admin-ui/target/app.jar

oc new-app myproject/admin-ui

oc expose dc admin-ui --port 8080

WEB_UI_HOST=$(oc get route -o=jsonpath='{.spec.host}'  web-ui)
oc create  route edge --service admin-ui

# mvn clean install
# oc start-build web-ui --from-file web-ui/target/app.jar
# oc start-build hello-service --from-file hello-service/target/app.jar

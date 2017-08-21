#!/usr/bin/env bash

set -e

cat web-ui/Dockerfile | sed 's/target\/app\.jar/app\.jar/g' | oc new-build --name hello-service -D -

oc start-build hello-service --from-file hello-service/target/app.jar

oc new-app myproject/hello-service

oc expose dc hello-service --port 8080

oc create  route edge --insecure-policy=Redirect --hostname=$(oc get route -o=jsonpath='{.spec.host}' web-ui) --path=/hello --service hello-service
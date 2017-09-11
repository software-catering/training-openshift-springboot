#!/usr/bin/env bash

set -e

oc set probe dc/web-ui --readiness --get-url=http://:8080/health

oc set probe dc/hello-service --readiness --get-url=http://:8080/hello/health

oc scale --replicas=2 dc web-ui

oc scale --replicas=2 dc hello-service

#!/usr/bin/env bash

set -e

oc set probe dc/web-ui --readiness --get-url=http://:8080/health
oc set probe dc/web-ui --liveness --get-url=http://:8080/health --period-seconds=5 --initial-delay-seconds=10 --timeout-seconds=2

oc set probe dc/hello-service --readiness --get-url=http://:8080/hello/health
oc set probe dc/hello-service --liveness --get-url=http://:8080/hello/health --period-seconds=5 --initial-delay-seconds=10 --timeout-seconds=2

oc scale --replicas=2 dc web-ui

oc scale --replicas=2 dc hello-service

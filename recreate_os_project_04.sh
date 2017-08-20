#!/usr/bin/env bash

set -e

oc new-app myproject/web-ui

oc expose dc web-ui --port 8080

oc create  route edge --service web-ui
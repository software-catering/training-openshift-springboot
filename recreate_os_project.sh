#!/usr/bin/env bash

set -e

oc delete all --all

./recreate_os_project_03.sh
#!/usr/bin/env bash

set -e

oc delete all --all

./recreate_os_project_03.sh
./recreate_os_project_04.sh
./recreate_os_project_05.sh
./recreate_os_project_06.sh
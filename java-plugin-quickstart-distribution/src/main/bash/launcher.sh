#!/bin/bash

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"
APP_HOME="${SCRIPT_DIR}/.."
LIB_DIR="${APP_HOME}/lib"

CLASSPATH=""
for filepath in "${LIB_DIR}"/*; do
  CLASSPATH="${CLASSPATH}:${filepath}"
done

java -cp "${CLASSPATH}" org.spyne.javapluginquickstart.core.App
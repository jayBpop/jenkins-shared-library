#!/bin/sh/groovy

echo "Building jar through maven!"
sh ' mvn clean '
sh ' mvn install'
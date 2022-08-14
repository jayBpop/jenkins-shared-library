#!usr/bin/env groovy
def call(){
    echo "Building jar through maven!"
    sh ' mvn clean '
    sh ' mvn install'
}

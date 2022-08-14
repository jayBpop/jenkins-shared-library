def call(){
    echo "Building docker image for the app!"

    sh 'docker build -t hdevop/myrepo: jsl_java_app-1.0 .'
}

def call(){

    echo "Pushing the docker image to docker hub!"

    withCredentials[(usernamePassword:(credentialsId:'docker-hub-repo', passwordVariable:'password', usernameVariable:'username'))]{
        sh 'echo $password | docker login -u $username --password-stdin'
        sh 'docker push devop/my-repo: jsl_java_app-1.0'
    }
}

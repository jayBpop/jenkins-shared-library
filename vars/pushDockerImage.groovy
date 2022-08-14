def call(String imageName){

    echo "Pushing the docker image to docker hub!"

    withCredentials([(usernamePassword(credentialsId:'docker-hub-repo', passwordVariable:'password', usernameVariable:'username')]){
        sh 'echo $password | docker login -u $username --password-stdin'
        sh "docker push $imageName"

    }
}

def call(String imageName){

    echo "Pushing the docker image to docker hub!"
    
    withCredentials([usernamePassword(credentialsId:'docker-hub-repo', passwordVariable:'password', usernameVariable:'username')])

<<<<<<< HEAD
   {
        sh 'echo $password | docker login -u $username --password-stdin'
        sh 'docker push hdevop/myrepo:jsl_java_app-1.0'
=======
    withCredentials([(usernamePassword(credentialsId:'docker-hub-repo', passwordVariable:'password', usernameVariable:'username')]){
        sh 'echo $password | docker login -u $username --password-stdin'
        sh "docker push $imageName"
>>>>>>> 0454e11 (passing imageName as parameter)
    }
}

def call(String imageName){
    echo "Building docker image for the app!"

    sh ' docker build -t  $imageName .'
}

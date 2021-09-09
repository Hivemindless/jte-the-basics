void call(){
    stage("Node: Build"){
        docker.image("node").inside{
            sh "npm -v"
        }
    }
}

void call(){
        stage("Node: Build"){
                println "build from the node library"
                sh "npm --version"
                //sh "npm install"
                //sh("npm run start")
        }
}

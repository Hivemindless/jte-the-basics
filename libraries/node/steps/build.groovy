void call(){
        stage("Node: Build"){
                println "build from the node library"
                node {
                        env.NODEJS_HOME = "${tool 'Node 6.x'}"
                        // on linux / mac
                        env.PATH="${env.NODEJS_HOME}/bin:${env.PATH}"
                        // on windows
                        env.PATH="${env.NODEJS_HOME};${env.PATH}"
                        sh 'npm --version'
                }
                //sh "npm --version"
                //sh "npm install"
                //sh("npm run start")
        }
}

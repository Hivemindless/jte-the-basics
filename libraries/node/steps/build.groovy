void call(){
        stage("Node: Build"){
                println "build from the node library"
                steps {
                        nodejs(nodeJSInstallationName: 'Node 6.x', configId: '<config-file-provider-id>') {
                                sh 'npm config ls'
                        }
                }
                //sh "npm --version"
                //sh "npm install"
                //sh("npm run start")
        }
}

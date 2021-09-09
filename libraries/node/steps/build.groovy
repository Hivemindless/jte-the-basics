def call(){
        stage("Node: Build"){
                println "build from the node library"
                steps {
                       // nodejs(nodeJSInstallationName: 'Node 6.x', configId: '<config-file-provider-id>') {
                                sh 'npm --version'
                        //}
                }
                
                //sh "npm install"
                //sh("npm run start")
        }
}

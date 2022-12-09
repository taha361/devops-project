def gv

pipeline {
    agent {
        docker { image 'node:16.13.1-alpine' }
    }
    
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    echo "building jar"
                    gv.buildJar()
                }
            }
        }
        stage("test ") {
            steps {
                script {
                    echo "testing ..."
                    gv.test()
                }
            }
        }
        
        stage("deploy on nexus") {
            steps {
                script {
                    echo "deploying"
                    
                }
            }
        }

        stage("build docker image") {
            steps {
                script {
                    echo "building image"
                    gv.buildImage()
                }
            }
        }
    }   
}
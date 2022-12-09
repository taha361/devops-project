def gv

pipeline {
    agent {
        docker {  image 'maven:3.8.1-adoptopenjdk-11'}
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
        stage("build image") {
            steps {
                script {
                    echo "building image"
                    gv.buildImage()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "deploying"
                    v.deployApp()
                }
            }
        }
    }   
}
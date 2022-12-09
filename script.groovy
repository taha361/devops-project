def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t tahaislem/devops-tp:taha-1.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push ntahaislem/devops-tp:taha-1.0'
    }
} 

def test() {
    echo 'testing the application...'
    sh 'mvn test'
} 

def deployApp() {
    echo 'deploying the application...'
    sh 'mvn deploy'
} 

return this
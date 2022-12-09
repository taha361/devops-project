def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."

} 

def test() {
    echo 'testing the application...'
    sh 'mvn test'
} 

def deployApp() {
    echo 'deploying the application...'
    
} 

return this
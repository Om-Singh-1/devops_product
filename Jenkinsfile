pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for sit enviroment...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in sit enviroment'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in sit to move to UAT'
            }
        }
    }
}      
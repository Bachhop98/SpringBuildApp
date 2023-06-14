pipeline {
    agent any
    stages {
        stage('Clone stage') {
            steps {
                git 'https://github.com/Bachhop98/SpringBuildApp.git'
            }
        }
        stage('Build stage') {
            steps {
            // This step should not normally be used in your script. Consult the inline help for details.
            withDockerRegistry(credentialsId: 'docker-hub', url: 'https://index.docker.io/v1/') {
                sh 'docker build -t bachhop9880/SpringBuildApp:v10'
                sh 'docker push bachhop9880/SpringBuildApp:v10'
            }
            }
        }
    }
}
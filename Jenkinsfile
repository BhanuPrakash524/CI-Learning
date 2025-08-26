pipeline {
    agent any

    tools {
        jdk 'jdk-21'          // MUST match the JDK installation name in Jenkins
        maven 'Maven3'        // MUST match the Maven installation name in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/BhanuPrakash524/CI-Learning.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo '✅ Build and Tests ran successfully!'
        }
        failure {
            echo '❌ Build failed! Check the logs.'
        }
    }
}

pipeline {
    agent any

    tools {
        jdk 'jdk-21'      // make sure this matches exactly in Jenkins config
        maven 'Maven'     // change to "Maven" since Jenkins has it as Maven
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

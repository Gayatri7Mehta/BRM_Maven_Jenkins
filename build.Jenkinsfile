pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'Maven'
    }

    stages {
        stage('Compile') {
            steps {
                echo 'Compiling the project...'
                sh "${MAVEN_HOME}/bin/mvn compile"
            }
        }

        stage('Code') {
            steps {
                echo 'Running code analysis...'
                // Remove this comment if you don't have specific code analysis tools
            }
        }

        stage('Review') {
            steps {
                echo 'Performing code review...'
                // Remove this comment if you don't have specific code review tools
            }
        }

        stage('Unit Test') {
            steps {
                echo 'Running unit tests...'
                sh "${MAVEN_HOME}/bin/mvn test"
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging the project...'
                sh "${MAVEN_HOME}/bin/mvn package"
            }
        }
    }

    post {
        success {
            echo 'Pipeline successfully executed. Additional success steps can be added here.'
        }

        failure {
            echo 'Pipeline failed. Additional failure steps can be added here.'
        }
    }
}

pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
               bat "rmdir  /s /q Teamazure"
                bat "git clone https://github.com/Mahajayanthi/Teamazure.git"
                bat "mvn clean -f Teamazure"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f Teamazure"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f Teamazure"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f Teamazure"
            }
        }
    }
}

// pipeline {
//     agent any
//     stages {
//         stage('git repo & clean') {
//             steps {
//                bat "rmdir  /s /q Teamazure"
//                 bat "git clone https://github.com/Mahajayanthi/Teamazure.git"
//                 bat "mvn clean -f Teamazure"
//             }
//         }
//         stage('install') {
//             steps {
//                 bat "mvn install -f Teamazure"
//             }
//         }
//         stage('test') {
//             steps {
//                 bat "mvn test -f Teamazure"
//             }
//         }
//         stage('package') {
//             steps {
//                 bat "mvn package -f Teamazure"
//             }
//         }
//     }
// }

pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
                script {
                    // Check if directory exists before removing it
                    if (fileExists('Teamazure')) {
                        bat "rmdir /s /q Teamazure"
                    }
                    
                    bat "git clone https://github.com/Mahajayanthi/Teamazure.git"
                    bat "mvn clean -f Teamazure"
                }
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

def fileExists(String path) {
    try {
        fileExists = new File(path).isDirectory()
    } catch (Exception e) {
        fileExists = false
    }
    return fileExists
}

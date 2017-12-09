
pipeline {
    agent any
    tools {
            maven 'maven-3.3.9'
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}



pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        bat 'mvn clean install -DskipTests'
      }
    }

    stage('Test') {
      steps {
        bat 'mvn test'
      }
    }

    stage('Docker Build') {
      steps {
        bat 'docker build -t hello .'
      }
    }

    stage('Deploy') {
      steps {
        bat 'docker run -p 8081:8081 hello'
      }
    }
  }
}

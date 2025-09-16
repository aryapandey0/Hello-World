pipeline{
  agent any
  stages{
    stage('build'){
      bat 'mvn clean package -DskipTests'
    }
    stage('test'){
      bat 'mvn test'
    }
    stage('docker build'){
      bat 'docker build -t hello:1.0 .'
    }
    stage('deploy'){
      bat 'docker rm -f hello || exit 0'
      bat 'docker run -d -p 8081:8081 --name hello hello:1.0'
    }
  }
}

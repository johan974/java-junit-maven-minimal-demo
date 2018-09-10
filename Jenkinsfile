node {
  checkout scm
  env.PATH = "${tool 'Maven3'}/bin:${env.PATH}"
  stage('Demo') {
      sh 'mvn clean test'
  }
}
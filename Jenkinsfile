node {
   checkout scm
   env.PATH = "${tool 'Maven3'}/bin:${env.PATH}"
   stage('Demo') {
       sh 'mvn clean test'
   }
   stage('SonarQube analysis') {
       withSonarQubeEnv('sonar2') {
         // requires SonarQube Scanner for Maven 3.2+
         // sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
         sh 'mvn sonar:sonar'
       }
     }
 }
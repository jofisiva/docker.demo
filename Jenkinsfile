pipeline {

agent any
 /*docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
}*/
 tools {
        maven 'maven'

    }
stages{
 stage('Compile Stage') {


 steps {
 // withMaven(maven :'maven') {
  sh 'mvn clean compile'
  //}
 }
 }

 stage('Testing Stage') {
  steps {
 // withMaven(maven :'maven') {
  sh 'mvn test'
  //}
  }
 }

  stage('Deployment Stage') {
   steps {
  // withMaven(maven :'maven') {
   sh 'mvn deploy'
   //}
   }
  }


}
}
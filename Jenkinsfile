pipeline {
	agent {
	    docker {
	        image 'maven:3.6-jdk-8'
	        args '-p 10001:10001'
	    }
	}
	stages {
		stage('build') {
			steps {
				echo 'starting building jar file'
				sh 'mvn package'
			}
		}
		stage('deploy') {
		    steps {
		        echo 'starting deploy the application'
		        sh 'cd target'
		        sh 'java -jar pinke_disc-0.0.1-SNAPSHOT.jar'
		    }
		}
	}
}
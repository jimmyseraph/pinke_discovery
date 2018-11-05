pipeline {
	agent any
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
		        sh 'jar_pid=`ps -ef | awk \'/pinke_disc.jar/ && !/awk/ {print $2}\'`'
		        sh 'if [ "$jar_pid" != "" ]; then kill -9 $jar_pid; fi'
		        sh 'cp -f target/pinke_disc-0.0.1-SNAPSHOT.jar /opt/microservices/pinke_disc.jar'
		        sh 'nohup java -jar /opt/microservices/pinke_disc.jar -cp /opt/microservices/pinke_disc.jar >> /opt/microservices/pinke_disc.log 2>&1 &'
		        sh 'sleep 5'
		        sh 'jar_pid=`ps -ef | awk \'/pinke_disc.jar/ && !/awk/ {print $2}\'`'
		        sh '[ "$jar_pid" != "" ]'
		    }
		}
	}
}
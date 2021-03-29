pipeline
	{
		agent any
		stages {
			stage('Build Application') {
				steps{
					bat 'mvn clean install'
										}
				}
				
			stage('Deply Application to Cloud') {
				steps{
					bat 'mvn package deploy -DmuleDeploy'
										}
				}
				
			stage('Perform regression Testing') {
				steps{
					bat 'cd C:\Users\dkefale\AppData\Roaming\npm'
					bat 'newman run D:\Temp\newman\CreditCardValidation.postman_collection.json -r htmlextra --reporter-htmlextra-export D:\Temp\newman --reporter-htmlextra-darktheme'
										}
				}
	}
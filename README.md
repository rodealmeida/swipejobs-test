# swipejobs-test

Instructions to run the App:

1. Clone the repo
2. Compile the project: mvn clean install (it will download wildfly-maven-plugin so it could take some time)
3. Run the application server: mvn wildfly:run
4. Test the API: http://localhost:8080/matcher/worker/jobs?workerId=562f66475ee4418d7ac560ab

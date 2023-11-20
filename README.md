Downloading and running :
git clone https://github.com/biswass/IAM.git
git checkout master
cd <to the directory>
mvn clean compile
Set JAVAPATH to your jdk directory eg : C:\Program Files\Java\jdk-1.8
Add jdk/bin folder to your PATH variable eg : C:\Program Files\Java\jdk-1.8
Download Eclipse or any other IDE and setup maven
Import this sourcecode as maven project
Right Click on project > Maven > Update project
Go to IAM Application.java > Right click > Run as > Java application
Hit localhost:8080/health

Dockerization :

mvn clean package 
java -jar .\IAM\IAM-0.0.1-SNAPSHOT.jar
docker build --tag=IAM:latest .
docker run -p8888:8081 IAM:latest 	// You can access the IAM service on http://localhost:8888/health
docker tag IAM:latest <yourDockerId>/IAM:latest
docker push <yourDockerId>/IAM:latest	// You should be logged into docker with your dockerId <yourDockerId>

// Now anyone can pull your docker image above
Dockerization :

mvn clean package 
java -jar .\IAM\IAM-0.0.1-SNAPSHOT.jar
docker build --tag=IAM:latest .
docker run -p8888:8081 IAM:latest 	// You can access the IAM service on http://localhost:8888/health
docker tag IAM:latest <yourDockerId>/IAM:latest
docker push <yourDockerId>/IAM:latest	// You should be logged into docker with your dockerId <yourDockerId>

// Now anyone can pull your docker image above
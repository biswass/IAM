FROM openjdk:8-jdk-alpine
MAINTAINER bits.com
COPY target/IAM-0.0.1-SNAPSHOT.jar IAM-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/IAM-0.0.1-SNAPSHOT.jar"]
# For Java 8, try this

# FROM openjdk:8-jdk-alpine

 

# For Java 11, try this

FROM openjdk:17-jdk-slim

 

# Refer to Maven build -> finalName

ARG JAR_FILE=target/car-project.jar

 

# cd /opt/app

WORKDIR .

 

# cp target/spring-boot-web.jar /opt/app/app.jar

COPY ${JAR_FILE} app.jar

 

# java -jar /opt/app/app.jar

ENTRYPOINT ["java","-jar","app.jar"]

 

## sudo docker run -p 8080:8080 -t docker-spring-boot:1.0

## sudo docker run -p 80:8080 -t docker-spring-boot:1.0

## sudo docker run -p 443:8443 -t docker-spring-boot:1.0


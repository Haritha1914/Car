FROM maven:3.8.5-openjdk-17 
#FROM maven:3.8.2-jdk-8

WORKDIR /46331916CarProject
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run
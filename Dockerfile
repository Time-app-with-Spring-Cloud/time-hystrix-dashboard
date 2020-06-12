FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} time-hystrix-dashboard.jar
ENTRYPOINT ["java","-jar","/time-hystrix-dashboard.jar"]
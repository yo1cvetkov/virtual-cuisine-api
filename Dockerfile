# FROM gradle:jdk23 AS build
# COPY . . 
# RUN ./gradlew clean build -x test --stacktrace --info

FROM openjdk:23-slim
WORKDIR /
COPY build/libs/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "demo.jar" ]

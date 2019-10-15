
FROM openjdk:8-jdk-alpine

COPY ./target/boot-gradle-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

RUN sh -c 'touch boot-gradle-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","boot-gradle-0.0.1-SNAPSHOT.jar"]
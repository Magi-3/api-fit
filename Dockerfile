FROM openjdk:17-jdk-alpine
LABEL maintainer="enzin"
VOLUME /tmp
ADD target/fit-core-0.0.1-SNAPSHOT.jar fit-core.jar
ENTRYPOINT ["java","-jar","fit-core.jar"]
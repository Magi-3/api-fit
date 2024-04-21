FROM openjdk:17-jdk-alpine
LABEL maintainer="enzin"
EXPOSE 8080
ARG JAR_FILE=target/fit-core-0.0.1-SNAPSHOT.jar fit-core.jar
ADD target/fit-core-0.0.1-SNAPSHOT.jar fit-core.jar
ENTRYPOINT ["java","-jar","fit-core.jar"]
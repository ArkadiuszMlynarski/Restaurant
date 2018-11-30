FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target/restaurant2.jar restaurant2.jar
ENTRYPOINT ["java","-jar","restaurant2.jar"]
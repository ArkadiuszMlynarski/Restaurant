FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target/restaurant.jar restaurant.jar
ENTRYPOINT ["java","-jar","restaurant.jar"]
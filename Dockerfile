FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
EXPOSE 8086
COPY target/restaurant.jar restaurant.jar
ENTRYPOINT ["java","-jar","restaurant.jar"]
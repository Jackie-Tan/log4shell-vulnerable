# FROM gradle:7.3.1-jdk17 AS builder
# COPY --chown=gradle:gradle . /home/gradle/src
# WORKDIR /home/gradle/src
# RUN gradle bootJar --no-daemon

FROM openjdk:20-bullseye

WORKDIR /app
COPY /build/libs/*.war /app/application.war

EXPOSE 8080

CMD ["java", "-jar", "/app/application.war"]

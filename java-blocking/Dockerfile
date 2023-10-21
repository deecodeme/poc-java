FROM amazoncorretto:17.0.9-alpine
LABEL maintainer="https://github.com/deecodeme"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=build/libs/*.jar
ADD ${JAR_FILE} application.jar
ENTRYPOINT ["java","-jar","/application.jar"]
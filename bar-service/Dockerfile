FROM java:8-jre-alpine

EXPOSE 8080

ADD bar-service.jar bar-service.jar

ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar bar-service.jar
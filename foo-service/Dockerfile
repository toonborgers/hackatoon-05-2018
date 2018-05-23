FROM java:8-jre-alpine

EXPOSE 8080

ADD foo-service.jar foo-service.jar

ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar foo-service.jar
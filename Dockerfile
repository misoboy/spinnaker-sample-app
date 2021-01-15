FROM harbor.misoboy.kr/public-dev-misoboy/openjdk:8-jdk-alpine

ARG APP_COLOR
USER root
ADD ./spinnaker-sample-app-0.0.1-SNAPSHOT.jar /root/spinnaker-sample-app.jar

ENV APP_COLOR ${APP_COLOR}

ENTRYPOINT ["java", "-jar", "/root/spinnaker-sample-app.jar"]

EXPOSE 8080

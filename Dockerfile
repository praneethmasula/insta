FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/insta-0.0.1-SNAPSHOT.jar insta.jar
ENTRYPOINT ["java","-jar","/insta.jar"]
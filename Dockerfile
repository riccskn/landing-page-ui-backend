FROM openjdk:11-jre-slim-buster
WORKDIR "/home"
COPY target/project-backend-1.0-SNAPSHOT.jar .
EXPOSE 9000
CMD ["java", "-jar", "project-backend-1.0-SNAPSHOT.jar"]
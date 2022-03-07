FROM openjdk:8-jdk-alpine
COPY target/movieDatabase-0.0.1-SNAPSHOT.jar movieDatabase.jar
ENTRYPOINT ["java","-jar","/movieDatabase.jar"]
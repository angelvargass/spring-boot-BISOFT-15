FROM openjdk:8-jdk-alpine
ENV cosmos-key=
ENV cosmos-secondary-key=
ENV cosmos-uri=
MAINTAINER vargas.angel
COPY target/movieDatabase-0.0.1-SNAPSHOT.jar movieDatabase-1.0.0.jar
ENTRYPOINT ["java","-jar","/movieDatabase-1.0.0.jar"]
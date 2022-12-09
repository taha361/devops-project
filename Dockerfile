FROM openjdk:8
ADD target/java-maven-app-1.1.0-SNAPSHOT.jar java-maven-app-1.1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","java-maven-app-1.1.0-SNAPSHOT.jar"]
EXPOSE 8080
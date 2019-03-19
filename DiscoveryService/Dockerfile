FROM openjdk:11
ADD target/Discovery-Service-0.0.1-SNAPSHOT.jar Discovery-Service.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "Discovery-Service.jar"]
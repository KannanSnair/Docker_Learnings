FROM openjdk:8
ADD target/hello-world-rest-api.jar hello-world-rest-api.jar
ENTRYPOINT ["java", "-jar", "hello-world-rest-api.jar"]
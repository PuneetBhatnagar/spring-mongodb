FROM openjdk:8
ADD target/spring-mongodb.jar spring-mongodb.jar
EXPOSE 8091
ENTRYPOINT ["java", "-jar", "spring-mongodb.jar"]
FROM openjdk:8
ADD target/medicare.jar medicare.jar
ENTRYPOINT ["java","-jar","/medicare.jar"]
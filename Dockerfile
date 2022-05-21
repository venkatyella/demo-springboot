FROM openjdk:8
EXPOSE 8080
ADD target/demo-springboot.jar demo-springboot.jar
ENTRYPOINT ["java","-jar","/demo-springboot.jar"]
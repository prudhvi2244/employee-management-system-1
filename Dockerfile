FROM openjdk:17-alpine
EXPOSE 9876
ADD target/ems-1.jar ems-1.jar
ENTRYPOINT ["java","-jar","ems-1.jar"]

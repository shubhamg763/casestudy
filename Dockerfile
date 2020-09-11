From maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
RUN mvn package -Dmaven.test.skip-=true
FROM openjdk:8
EXPOSE 8082
ADD target/stock-exchange.jar stock-exchange.jar
ENTRYPOINT ["java","-jar","/stock-exchange.jar"]
From maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
MAINTAINER Shubham Gupta
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn clean package -DskipTests
FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8082
COPY --from=MAVEN_BUILD /build/target/stock-exchange.jar /app/
ENTRYPOINT ["java","-jar","/stock-exchange.jar"]
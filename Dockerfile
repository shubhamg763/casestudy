FROM openjdk:8
EXPOSE 8082
ADD target/stock-exchange.jar stock-exchange.jar
ENTRYPOINT ["java","-jar","/stock-exchange.jar"]
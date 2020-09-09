FROM openjdk:8
ADD target/stock-exchange.jar stock-exchange.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "stock-exchange.jar"]
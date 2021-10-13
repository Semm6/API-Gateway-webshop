FROM openjdk:11
EXPOSE 9192
ADD target/API-Gateway-webshop.jar API-Gateway-webshop.jar
ENTRYPOINT ["java", "-jar", "/API-Gateway-webshop.jar"]
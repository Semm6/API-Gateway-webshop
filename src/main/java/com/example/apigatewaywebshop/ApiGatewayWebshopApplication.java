package com.example.apigatewaywebshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayWebshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayWebshopApplication.class, args);
    }

}

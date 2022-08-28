package com.example.managerserverv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ManagerServerV2Application {

    public static void main(String[] args) {
        SpringApplication.run(ManagerServerV2Application.class, args);
    }

}

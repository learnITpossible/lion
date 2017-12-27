package com.domain.lion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LionApplication {

    public static void main(String[] args) {

        SpringApplication.run(LionApplication.class, args);
    }
}

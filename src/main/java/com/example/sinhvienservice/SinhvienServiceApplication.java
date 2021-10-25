package com.example.sinhvienservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SinhvienServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SinhvienServiceApplication.class, args);
    }

}

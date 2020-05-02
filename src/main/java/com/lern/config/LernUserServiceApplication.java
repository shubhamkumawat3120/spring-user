package com.lern.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LernUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LernUserServiceApplication.class, args);
	}

}

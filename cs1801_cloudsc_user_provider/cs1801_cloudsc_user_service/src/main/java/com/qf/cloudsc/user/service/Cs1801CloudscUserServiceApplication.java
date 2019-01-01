package com.qf.cloudsc.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Cs1801CloudscUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cs1801CloudscUserServiceApplication.class, args);
	}

}


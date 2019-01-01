package com.qf.cloudsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cs1801CloudscEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cs1801CloudscEurekaServerApplication.class, args);
	}

}


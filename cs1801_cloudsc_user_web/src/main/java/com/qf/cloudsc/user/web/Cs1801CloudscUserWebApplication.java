package com.qf.cloudsc.user.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class Cs1801CloudscUserWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cs1801CloudscUserWebApplication.class, args);
	}

}


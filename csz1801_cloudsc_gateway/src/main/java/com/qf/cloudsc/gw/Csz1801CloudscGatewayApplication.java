package com.qf.cloudsc.gw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Csz1801CloudscGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Csz1801CloudscGatewayApplication.class, args);
    }

}


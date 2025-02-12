package com.ahmad.ecomapp_servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcomappServicediscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomappServicediscoveryApplication.class, args);
	}

}

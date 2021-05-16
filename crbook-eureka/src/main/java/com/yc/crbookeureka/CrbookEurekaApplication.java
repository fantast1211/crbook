package com.yc.crbookeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CrbookEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrbookEurekaApplication.class, args);
	}

}

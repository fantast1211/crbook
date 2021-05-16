package com.com.crbookconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CrbookConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrbookConfigApplication.class, args);
	}

}

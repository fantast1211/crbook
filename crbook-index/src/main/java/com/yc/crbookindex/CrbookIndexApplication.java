package com.yc.crbookindex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
public class CrbookIndexApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrbookIndexApplication.class, args);
	}

}

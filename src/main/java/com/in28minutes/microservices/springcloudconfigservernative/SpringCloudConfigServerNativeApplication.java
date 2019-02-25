package com.in28minutes.microservices.springcloudconfigservernative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerNativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerNativeApplication.class, args);
	}

}

package com.xxlai.serverhidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServerHiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerHiDemoApplication.class, args);
	}
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class GatewayMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayMicroApplication.class, args);
	}

}

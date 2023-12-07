package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Client;
import com.example.demo.repos.ClientRepositpry;


@EnableDiscoveryClient
@SpringBootApplication
public class ClientMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientMicroApplication.class, args);
		
	}
	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepositpry clientRepository) {
	    return args -> {
	       clientRepository.save(new Client(Long.parseLong("1"), "Rabab FAHSSI", Float.parseFloat("23")));
	       clientRepository.save(new Client(Long.parseLong("2"), "Houda EL KORAINI", Float.parseFloat("22")));
	       clientRepository.save(new Client(Long.parseLong("3"), "Saad BAKANZIZE", Float.parseFloat("22")));

	    };
	}


}

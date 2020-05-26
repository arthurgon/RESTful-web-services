package com.telefonica.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.telefonica.api.services.ServiceExample;

@SpringBootApplication
public class ServiceExampleApplication {

	@Autowired
	private ServiceExample serviceExample;
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceExampleApplication.class, args);
	}
//	@Bean
//	public CommandLineRunner commandLineRunner() {
//		return args -> {
//			this.serviceExample.testarServico();
//		};
//	}
}

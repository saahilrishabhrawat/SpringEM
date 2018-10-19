package com.optum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.optum.rxclaimnextgen.services.ClaimServices;
import com.optum.rxclaimnextgen.services.impl.ClaimServicesImpl;

@SpringBootApplication
@Configuration
@ComponentScan("com.optum.rxclaimnextgen")
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
	}

	
}

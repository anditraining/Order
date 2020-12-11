package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldDemoApplication {
	
	final static Logger logger = LoggerFactory.getLogger(HelloWorldDemoApplication.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(HelloWorldDemoApplication.class, args);
		logger.info("spring container created");
	}

}

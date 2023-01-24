package com.springrest.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@SpringBootApplication
@EnableAutoConfiguration
public class SpringrestApplication {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(SpringrestApplication.class);
		System.setProperty("logfile", "C:\\PROJECTS\\springrest");
		logger.info("Hello ---- > Spring boot application is starting");
		
		SpringApplication.run(SpringrestApplication.class, args);
		
	}

}

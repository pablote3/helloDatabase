package com.rossotti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDatabaseApplication {

	private static final Logger log = LoggerFactory.getLogger(HelloDatabaseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HelloDatabaseApplication.class, args);
	}
}

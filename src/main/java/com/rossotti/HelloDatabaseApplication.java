package com.rossotti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloDatabaseApplication {

	public static void main(String[] args) {
		System.out.println("Begin SpringApplication.run");
		SpringApplication.run(HelloDatabaseApplication.class, args);
		System.out.println("End SpringApplication.run");
	}
}

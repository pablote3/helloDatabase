package com.rossotti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDatabaseApplication {

	public static void main(String[] args) {
		System.out.println("Begin SpringApplication.run");
		SpringApplication.run(HelloDatabaseApplication.class, args);
		System.out.println("End SpringApplication.run");
	}
}

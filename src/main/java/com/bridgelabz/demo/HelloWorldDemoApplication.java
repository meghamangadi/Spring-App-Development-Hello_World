package com.bridgelabz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello from BridgeLabz");
		SpringApplication.run(HelloWorldDemoApplication.class, args);
	}

}

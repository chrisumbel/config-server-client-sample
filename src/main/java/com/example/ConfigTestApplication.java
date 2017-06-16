package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigTestApplication {
	public static void main(String[] args) {		
		ApplicationContext ctx = SpringApplication.run(ConfigTestApplication.class, args);
	}
}

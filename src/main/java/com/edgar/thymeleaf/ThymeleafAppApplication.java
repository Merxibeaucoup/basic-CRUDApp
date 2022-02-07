package com.edgar.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafAppApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8082");
		SpringApplication.run(ThymeleafAppApplication.class, args);
	}

}

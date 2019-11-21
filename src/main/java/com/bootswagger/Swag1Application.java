package com.bootswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"com.bootswagger.controller","com.bootswagger.config","com.bootswagger.db"})
public class Swag1Application {
	public static void main(String[] args) {
		SpringApplication.run(Swag1Application.class, args);
	}

}

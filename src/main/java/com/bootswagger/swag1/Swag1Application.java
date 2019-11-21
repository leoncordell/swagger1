package com.bootswagger.swag1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan({"com.bootswagger.controller","com.bootswagger.config"})
public class Swag1Application {
	public static void main(String[] args) {
		SpringApplication.run(Swag1Application.class, args);
	}

}

package com.alejandro.list.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class ApirestApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);

	}

}

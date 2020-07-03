package com.nirodha.Car.Pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CarPoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarPoolApplication.class, args);
	}

}

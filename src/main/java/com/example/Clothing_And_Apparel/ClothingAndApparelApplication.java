package com.example.Clothing_And_Apparel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class ClothingAndApparelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClothingAndApparelApplication.class, args);
	}

}

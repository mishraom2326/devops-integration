package com.mongodb.example.mongodbproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class MongodbprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbprojApplication.class, args);
	}

}

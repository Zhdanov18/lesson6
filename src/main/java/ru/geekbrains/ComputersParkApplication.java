package ru.geekbrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ComputersParkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputersParkApplication.class, args);
	}

}

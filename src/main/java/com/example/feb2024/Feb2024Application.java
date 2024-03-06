package com.example.feb2024;

import com.example.feb2024.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.feb2024.repository")
public class Feb2024Application {

	public static void main(String[] args) {
		SpringApplication.run(Feb2024Application.class, args);
	}

}
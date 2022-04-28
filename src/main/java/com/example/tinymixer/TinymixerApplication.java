package com.example.tinymixer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TinymixerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinymixerApplication.class, args);
	}

}

package com.example.tinymixer.utils;

import com.example.tinymixer.dao.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StressDatabaseLoader {
    @Bean
    CommandLineRunner initStressData(EmployeeRepository repository) {
        return args -> {

        };
    }
}

package com.example.tinymixer.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PreWorker {
    private static final Logger log = LoggerFactory.getLogger(PreWorker.class);

    @Bean
    CommandLineRunner initDatabase() {
        return args -> {

        };
    }
}

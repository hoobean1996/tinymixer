package com.example.tinymixer.utils;

import com.example.tinymixer.dao.FeedRepository;
import com.example.tinymixer.dao.StudentRepository;
import com.example.tinymixer.dao.UserRepository;
import com.example.tinymixer.model.Feed;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StressDatabaseLoader {
    @Bean
    CommandLineRunner initStressData(StudentRepository repository) {
        return args -> {
            System.out.println(repository.findById(100008));
            System.out.println(repository.findByAcdemicNumber("a1234"));
        };
    }
}

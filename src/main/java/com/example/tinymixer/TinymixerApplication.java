package com.example.tinymixer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


// 会在Spring环境初始化完成以后 优先会被调用的函数
// main -> 程序的开头
// @Bean + CommandRunner -> 你向Spring框架提供了几个函数, Spring会单独去单独去调用

// private UserRepository repository;
// @Bean
// public CommandLineRunner listAll(){
//
// }
@SpringBootApplication
public class TinymixerApplication {
	public static void main(String[] args) {

		SpringApplication.run(TinymixerApplication.class, args);
	}
}

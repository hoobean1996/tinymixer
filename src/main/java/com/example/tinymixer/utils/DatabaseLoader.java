package com.example.tinymixer.utils;

import com.example.tinymixer.dao.EmployeeRepository;
import com.example.tinymixer.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.URI;
import java.util.List;

@Configuration
public class DatabaseLoader {
    private static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            OkHttpClient client = new OkHttpClient();
            // 注册
            // 登陆 -> token



            HttpUrl.Builder urlBuilder = HttpUrl.get(URI.create("http://localhost:9999/api/users")).newBuilder();
            urlBuilder.addQueryParameter("type", "student");

            // Builder 模式
            // 专门用来构建比较复杂的对象的
            Request toTinyMixerRequest = new Request.Builder()
                    .url(urlBuilder.build())
                    .build();

            try {
                Response fromTinyMixerResponse = client
                        .newCall(toTinyMixerRequest)
                        .execute();
                ResponseBody body = fromTinyMixerResponse.body();
                // Response -> 不是你具体的业务数据类型
                // body -> 具体的内容
                // Jackson 这个库来帮助我们把
                // ResponseBody -> 具体的类型
                // String -> T
                // Jackson
                // 反序列化：从byte流转换为具体的对象 Decode
                // 序列化：从具体的对象到byte流 Encode
                ObjectMapper objectMapper = new ObjectMapper();
                User[] users = objectMapper.readValue(body.string(), User[].class);

                for(User user: users) {
                    System.out.println("***:" + user);
                }

            } catch (IOException e) {
                System.out.print(e);
            }
        };
    }
}

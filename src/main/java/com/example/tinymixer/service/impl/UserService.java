package com.example.tinymixer.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.tinymixer.dao.UserRepository;
import com.example.tinymixer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class UserService {
    @Autowired
    private final UserRepository repository;

    private static final Logger log = LoggerFactory.getLogger(UserService.class);


    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // 用户注册
    // 1. 不能有重复的email
    // 2. 用户名不能为空字符串
    // 3. 只接受用户名包含yy的用户注册
    // 4. 保存到数据库即可
    public User register(String email, String name) {
        User user = new User(email, name);
        repository.save(user);
        log.info(String.format("inserted new user: %s, %s", email, name));
        return user;
    }

    // 查询所有用户
    public List<User> findAll() {
        return repository.findAll();
    }
    // 查询用户名中包含yy的所有用户
    public List<User> findAllByCondition(String contains) {
        return null;
    }
}

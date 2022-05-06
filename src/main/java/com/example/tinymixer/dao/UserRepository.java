package com.example.tinymixer.dao;

import com.example.tinymixer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // 保存一个用户
    public User save(User user);

    public User findById(long id);

    public User findByEmail(String email);
}


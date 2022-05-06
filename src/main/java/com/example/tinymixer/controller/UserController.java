package com.example.tinymixer.controller;


import com.example.tinymixer.vo.LoginRequest;
import com.example.tinymixer.vo.LoginResponse;
import com.example.tinymixer.vo.RegisterRequest;
import com.example.tinymixer.vo.RegisterResponse;
import com.example.tinymixer.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/account")
public class UserController {
    @Autowired
    private IAccountService accountService;


    @PostMapping("/register")
    public RegisterResponse handleRegister(@RequestBody RegisterRequest request) {
        return accountService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse handleLogin(@RequestBody LoginRequest request) {
        return accountService.login(request);
    }
}

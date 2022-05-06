package com.example.tinymixer.service;

import com.example.tinymixer.vo.LoginRequest;
import com.example.tinymixer.vo.LoginResponse;
import com.example.tinymixer.vo.RegisterRequest;
import com.example.tinymixer.vo.RegisterResponse;

public interface IAccountService {
    public RegisterResponse register(RegisterRequest request);

    public LoginResponse login(LoginRequest request);
}

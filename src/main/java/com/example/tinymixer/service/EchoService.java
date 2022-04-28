package com.example.tinymixer.service;

import org.springframework.stereotype.Service;

@Service
public class EchoService {
    String echo(String any) {
        return any;
    }
}

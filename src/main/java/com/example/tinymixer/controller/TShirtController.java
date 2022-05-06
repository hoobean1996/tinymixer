package com.example.tinymixer.controller;


import com.example.tinymixer.vo.ListTShirtRequest;
import com.example.tinymixer.vo.ListTShirtResponse;
import com.example.tinymixer.service.ITShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/tshirt")
public class TShirtController {
    @Autowired
    private ITShirtService tShirtService;

    @GetMapping("/list")
    public ListTShirtResponse handleList(ListTShirtRequest request) {
        return tShirtService.list(request);
    }
}

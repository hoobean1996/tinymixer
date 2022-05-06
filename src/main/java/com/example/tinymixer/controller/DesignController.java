package com.example.tinymixer.controller;


import com.example.tinymixer.vo.UploadRequest;
import com.example.tinymixer.vo.UploadResponse;
import com.example.tinymixer.service.IDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/design")
public class DesignController {
    @Autowired
    private IDesignService designService;


    @PostMapping("/upload")
    public UploadResponse handleUpload(@RequestBody UploadRequest request) {
        return designService.upload(request);
    }
}

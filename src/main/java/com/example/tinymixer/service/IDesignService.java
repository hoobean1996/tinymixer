package com.example.tinymixer.service;

import com.example.tinymixer.vo.UploadRequest;
import com.example.tinymixer.vo.UploadResponse;

public interface IDesignService {
    public UploadResponse upload(UploadRequest request);
}

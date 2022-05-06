package com.example.tinymixer.service;

import com.example.tinymixer.vo.ListTShirtRequest;
import com.example.tinymixer.vo.ListTShirtResponse;

public interface ITShirtService {
    public ListTShirtResponse list(ListTShirtRequest request);
}

package com.example.tinymixer.controller;

import com.example.tinymixer.model.Student;
import com.example.tinymixer.model.StudentMetadata;
import com.example.tinymixer.model.User;
import com.example.tinymixer.service.IStudentService;
import com.example.tinymixer.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EchoController {
    @Autowired
    private final UserService service;

    @Autowired
    private IStudentService studentService;

    public EchoController(UserService service) {
        this.service = service;
    }

    @GetMapping("/api/register")
    @ResponseBody
    public User registerUser(@RequestParam String email, @RequestParam String name){
       return service.register(email, name);
    }

    @GetMapping("/api/users")
    @ResponseBody
    public List<User> listAllUsers() {
        return service.findAll();
    }

    // Create a student
    @PostMapping("/student/register")
    @ResponseBody
    public Student registerStudent(@RequestBody Student student) {
        return studentService.register(student);
    }

    // Find a student by acdemic number
    @GetMapping("/student")
    public StudentMetadata findStudentByAcdemicNumber(@RequestParam(value = "acdemicNumber") String number) {
        return studentService.findStudent(number);
    }
}


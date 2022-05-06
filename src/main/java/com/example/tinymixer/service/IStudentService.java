package com.example.tinymixer.service;

import com.example.tinymixer.model.Student;
import com.example.tinymixer.model.StudentMetadata;

public interface IStudentService {
    Student register(Student s);

    StudentMetadata findStudent(String acdemicNUmber);
}

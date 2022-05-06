package com.example.tinymixer.service.impl;

import com.example.tinymixer.dao.StudentRepository;
import com.example.tinymixer.dao.CacheStudentRepository;
import com.example.tinymixer.model.Student;
import com.example.tinymixer.model.StudentMetadata;
import com.example.tinymixer.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private final StudentRepository repository;

    @Autowired
    private final CacheStudentRepository repositoryRedis;

    public StudentService(StudentRepository repository, CacheStudentRepository repositoryRedis) {
        this.repository = repository;
        this.repositoryRedis = repositoryRedis;
    }

    @Override
    public Student register(Student student) {
        if (student.getName().equals("")) {
            return null;
        } else {
            repository.save(student);
        }
        return student;
    }

    @Override
    public StudentMetadata findStudent(String acdemicNUmber) {


        StudentMetadata result = repositoryRedis.findByAcdemicNumber(acdemicNUmber);
        if (result != null) {
            // get from Redis
            System.out.println("find student in Redis");
            return result ;

        } else {
            // get student from Mysql
            Student student = repository.findByAcdemicNumber(acdemicNUmber);
            if (student != null) {
                StudentMetadata sm = new StudentMetadata(student.getId(),student.getName(), student.getAge(), student.getAcdemicNumber());
                StudentMetadata smToCache = repositoryRedis.save(sm);
                System.out.println("find student in Mysql and Successfully saved in Redis");
                return smToCache;
            } else {
                System.out.println("Did not find target student in Redis and Mysql!!");
                return new StudentMetadata();
            }
        }
    }
}

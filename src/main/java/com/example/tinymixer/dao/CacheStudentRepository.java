package com.example.tinymixer.dao;

import com.example.tinymixer.model.Student;
import com.example.tinymixer.model.StudentMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CacheStudentRepository extends CrudRepository<StudentMetadata, Long> {
    StudentMetadata save(StudentMetadata studentMetadata);

    StudentMetadata findById(long id);

    StudentMetadata findByAcdemicNumber(String number);
}


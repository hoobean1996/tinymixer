package com.example.tinymixer.dao;

import com.example.tinymixer.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student save(Student student);

    Student findById(long id);

    Student findByAcdemicNumber(String acdemicNumber);
}


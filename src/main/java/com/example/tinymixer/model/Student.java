package com.example.tinymixer.model;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Student{
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int age;
    private String acdemicNumber;

    public Student() {}

    public Student(Long id, String name, int age, String acdemicNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.acdemicNumber = acdemicNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAcdemicNumber() {
        return acdemicNumber;
    }

    public void setAcdemicNumber(String acdemicNumber) {
        this.acdemicNumber = acdemicNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", acdemicNumber='" + acdemicNumber + '\'' +
                '}';
    }
}

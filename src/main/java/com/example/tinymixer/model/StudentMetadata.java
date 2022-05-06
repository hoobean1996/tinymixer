package com.example.tinymixer.model;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

// Redis
// Map<String, Object>
//      - Object -> String, Set, M
// MAP<STRING, INT>
// MAP<STRING, STRING>
// MAP<STRING, SET>
// MAP<STRING, MAP>
    // HSET KEY [key value] [key value]


@RedisHash("StudentMetadata")
public class StudentMetadata implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int age;
    private String acdemicNumber;

    public StudentMetadata() {}

    public StudentMetadata(long id, String name, int age, String acdemicNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.acdemicNumber = acdemicNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
        return "StudentMetadata{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", acdemicNumber='" + acdemicNumber + '\'' +
                '}';
    }
}

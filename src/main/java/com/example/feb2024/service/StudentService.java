package com.example.feb2024.service;

import com.example.feb2024.model.Student;
import com.example.feb2024.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
        //prepare select * from student;
        //execute the query and get the result set
        //map each record in result set to the student object
        //add the student object to the list
    }
}

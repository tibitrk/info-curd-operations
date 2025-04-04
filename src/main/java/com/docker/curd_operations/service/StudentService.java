package com.docker.curd_operations.service;

import com.docker.curd_operations.model.Student;
import com.docker.curd_operations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
}

package com.docker.curd_operations.service;

import com.docker.curd_operations.model.Student;
import com.docker.curd_operations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

}

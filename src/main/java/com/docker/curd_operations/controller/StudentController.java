package com.docker.curd_operations.controller;

import com.docker.curd_operations.model.Student;
import com.docker.curd_operations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<String> saveStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return ResponseEntity.ok("student created successfully");
    }
}

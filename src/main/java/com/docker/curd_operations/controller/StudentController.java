package com.docker.curd_operations.controller;

import com.docker.curd_operations.model.Student;
import com.docker.curd_operations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<String> saveStudent(@RequestBody Student student){

        try{

            studentService.createStudent(student);
            return ResponseEntity.ok("student created successfully");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to save student "+ e.getMessage());
        }
    }
    @GetMapping("/get")
    public ResponseEntity<List<Student>> getAllStudent(){
        try {
            List<Student> students= studentService.getAllStudent();
             return ResponseEntity.ok(students);
        }catch (Exception e){
             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id){
        try {
            Student student = studentService.getStudentById(id);
            if(student !=null) {
                return ResponseEntity.ok(student);
            }else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with ID " + id + " not found.");
            }
        }catch (Exception e){
           e.printStackTrace();
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while fetching the student.");
        }
    }
}

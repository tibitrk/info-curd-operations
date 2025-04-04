package com.docker.curd_operations.repository;

import com.docker.curd_operations.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

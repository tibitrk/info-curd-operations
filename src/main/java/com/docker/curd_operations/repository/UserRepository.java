package com.docker.curd_operations.repository;

import com.docker.curd_operations.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

package com.grading.teacher.repository;

import com.grading.teacher.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

// UserRepository.java
public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom queries if needed
}

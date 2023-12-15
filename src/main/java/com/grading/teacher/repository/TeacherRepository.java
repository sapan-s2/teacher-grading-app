package com.grading.teacher.repository;

import com.grading.teacher.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

// TeacherRepository.java
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // Add custom queries if needed
}

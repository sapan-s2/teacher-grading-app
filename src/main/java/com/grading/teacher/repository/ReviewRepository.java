package com.grading.teacher.repository;

import com.grading.teacher.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

// ReviewRepository.java
public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Add custom queries if needed
}

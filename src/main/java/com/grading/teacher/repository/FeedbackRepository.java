package com.grading.teacher.repository;

import com.grading.teacher.domain.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

// FeedbackRepository.java
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    // Add custom queries if needed
}

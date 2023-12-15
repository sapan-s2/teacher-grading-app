package com.grading.teacher.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

// Review.java
@Getter
@Setter
@ToString
@Entity
@Table(name = "review")
public class Review {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String reviewText;
    private LocalDateTime timestamp;

    // Getters and setters
}

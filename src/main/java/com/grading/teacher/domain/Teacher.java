package com.grading.teacher.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

// Teacher.java

@Getter
@Setter
@ToString
@Entity
@Table(name = "teacher")
public class Teacher {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, fetch = FetchType.LAZY) private List<Feedback> feedbacks;
    // Getters and setters
}

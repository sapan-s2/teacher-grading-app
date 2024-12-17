
package com.grading.teacher.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

// User.java

@Getter
@Setter
@ToString
@Entity
@Table(name = "user")
public class User {
    @Column(name = "user_id")
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private UserType userType; // Enum: Student, Parent
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY) private List<Feedback> feedbacks;
    // Getters and setters
}

package com.grading.teacher.service;

import com.grading.teacher.domain.Feedback;
import com.grading.teacher.domain.FeedbackRequest;
import com.grading.teacher.domain.Teacher;
import com.grading.teacher.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

// FeedbackService.java
@Service
public class FeedbackService {
    private final FeedbackRepository feedbackRepository;

    @Autowired
    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    // Implement feedback-related services
    public void saveFeedback(Feedback feedback) {
//        Teacher teacher      = teacherService.getTeacherById(feedbackRequest.getTeacherId());
//        User user = userService.getUserById(feedbackRequest.getUserId());
//        FeedbackForm feedbackForm = feedbackFormService.getFeedbackFormById(feedbackRequest.getFormId());
//
//        // Create a new feedback entity
//        Feedback feedback = new Feedback();
//        feedback.setTeacher(teacher);
//        feedback.setUser(user);
//        feedback.setForm(feedbackForm);
//        feedback.setRating(feedbackRequest.getRating());
//        feedback.setComment(feedbackRequest.getComment());
//        feedback.setTimestamp(LocalDateTime.now());

        // Save the feedback to the database
        feedbackRepository.save(feedback);
    }

}

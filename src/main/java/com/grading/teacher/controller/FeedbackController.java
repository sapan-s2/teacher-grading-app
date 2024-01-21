package com.grading.teacher.controller;

import com.grading.teacher.domain.Feedback;
import com.grading.teacher.domain.FeedbackRequest;
import com.grading.teacher.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// FeedbackController.java
@RestController
@RequestMapping("/api/feedbacks")
public class FeedbackController {


    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    // Implement feedback-related API endpoints
    @PostMapping("/submit")
    @ResponseBody
    public ResponseEntity<String> submitFeedback(@RequestBody Feedback feedback) {
//        try {
            // Retrieve teacher, user, and feedback form based on provided IDs
        Feedback feedback1 = feedbackService.saveFeedback(feedback);
        return new ResponseEntity<>( HttpStatus.CREATED);
//            return ResponseEntity.ok("Feedback submitted successfully!");
//        }
//        catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error submitting feedback");
//        }
    }


}

package com.grading.teacher.controller;

import com.grading.teacher.service.FeedbackFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// FeedbackFormController.java
@RestController
@RequestMapping("/api/feedback-forms")
public class FeedbackFormController {
    private final FeedbackFormService feedbackFormService;

    @Autowired
    public FeedbackFormController(FeedbackFormService feedbackFormService) {
        this.feedbackFormService = feedbackFormService;
    }

    // Implement feedback form-related API endpoints
}

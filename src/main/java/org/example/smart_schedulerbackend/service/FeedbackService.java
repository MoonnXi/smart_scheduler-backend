package org.example.smart_schedulerbackend.service;

import org.example.smart_schedulerbackend.model.entity.Feedback;

import java.util.Map;

public interface FeedbackService {
    Map<String,Object> problemandadvice(Feedback feedback);
}

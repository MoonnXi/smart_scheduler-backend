package org.example.smart_schedulerbackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.smart_schedulerbackend.model.entity.Feedback;

@Mapper
public interface FeedbackMapper {
    int ProblemAndAdvice(Feedback feedback);
}

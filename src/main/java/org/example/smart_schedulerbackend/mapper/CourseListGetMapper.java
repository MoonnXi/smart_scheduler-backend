package org.example.smart_schedulerbackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.smart_schedulerbackend.model.entity.SchedulingTask;

import java.util.List;
import java.util.Map;

@Mapper
public interface CourseListGetMapper {
    List<SchedulingTask> getCourseList(Map<String,String> param);
}

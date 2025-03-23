package org.example.smart_schedulerbackend.service.impl;

import org.example.smart_schedulerbackend.mapper.CourseListGetMapper;
import org.example.smart_schedulerbackend.model.entity.SchedulingTask;
import org.example.smart_schedulerbackend.service.CourseListGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseListGetServiceImpl implements CourseListGetService {
    @Autowired
    private CourseListGetMapper courseListGetMapper;

    @Override
    public List<SchedulingTask> getcourselist(String classSchoolDistrict,String classroomname)
    {
        Map<String,String> dataMap = new HashMap<>();
        dataMap.put("classSchoolDistrict",classSchoolDistrict);
        dataMap.put("classCompose",classroomname);
        List<SchedulingTask> scheduling = courseListGetMapper.getCourseList(dataMap);
        return scheduling;
    }
}

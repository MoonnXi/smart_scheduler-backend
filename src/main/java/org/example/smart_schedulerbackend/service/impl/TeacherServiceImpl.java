package org.example.smart_schedulerbackend.service.impl;

import org.example.smart_schedulerbackend.mapper.TeacherMapper;
import org.example.smart_schedulerbackend.model.entity.ClassroomInformation;
import org.example.smart_schedulerbackend.model.entity.Teacher;
import org.example.smart_schedulerbackend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getAllTeacherInformation(String department,int page,int size)
    {
        List<Teacher> dataMap = teacherMapper.getAllTeacherInformation(department);
        int start = (page - 1) * size;
        int end = Math.min(start + size, dataMap.size());
        if (start >= dataMap.size()) {
            return List.of();
        }
        return dataMap.subList(start,end);
    }

    @Override
    public Map<String,Object> countTeacherInformation(String department)
    {
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("number",teacherMapper.countTeacherInformation(department));
        return dataMap;
    };
}

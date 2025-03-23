package org.example.smart_schedulerbackend.service;

import org.example.smart_schedulerbackend.model.entity.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherService {
    List<Teacher> getAllTeacherInformation(String department,int page,int size);
    Map<String,Object> countTeacherInformation(String department);
}

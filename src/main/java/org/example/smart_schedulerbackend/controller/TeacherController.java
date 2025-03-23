package org.example.smart_schedulerbackend.controller;

import org.example.smart_schedulerbackend.model.entity.Teacher;
import org.example.smart_schedulerbackend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping("/getallteacherinformation")
    public List<Teacher> getallteacherinformation(@RequestParam String department,@RequestParam int page,@RequestParam int size)
    {
        return teacherService.getAllTeacherInformation(department,page,size);
    }

    @PostMapping("/countteacherinformation")
    public Map<String,Object> countteacherinformation(@RequestParam String department)
    {
        return teacherService.countTeacherInformation(department);
    }
}

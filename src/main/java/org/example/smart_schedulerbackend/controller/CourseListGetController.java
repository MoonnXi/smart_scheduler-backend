package org.example.smart_schedulerbackend.controller;

import org.example.smart_schedulerbackend.model.entity.SchedulingTask;
import org.example.smart_schedulerbackend.service.CourseListGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseListGetController {
    @Autowired
    private CourseListGetService courseListGetService;

    @PostMapping("/courselistget")
    public List<SchedulingTask> courselistget(@RequestParam String classSchoolDistrict,@RequestParam String classname)
    {
        return courseListGetService.getcourselist(classSchoolDistrict,classname);
    }
}
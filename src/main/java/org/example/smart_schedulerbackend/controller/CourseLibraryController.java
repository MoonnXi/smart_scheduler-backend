package org.example.smart_schedulerbackend.controller;

import org.example.smart_schedulerbackend.model.dto.CourseLibraryDTO;
import org.example.smart_schedulerbackend.model.entity.CourseLibrary;
import org.example.smart_schedulerbackend.service.CourseLibraryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/courses")
public class CourseLibraryController {

    @Autowired
    private CourseLibraryService courseLibraryService;

    @GetMapping
    public List<CourseLibraryDTO> getAllCourses() {
        List<CourseLibrary> courses = courseLibraryService.getAllCourses();
        return courses.stream()
                .map(course -> {
                    CourseLibraryDTO dto = new CourseLibraryDTO();
                    BeanUtils.copyProperties(course, dto);
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
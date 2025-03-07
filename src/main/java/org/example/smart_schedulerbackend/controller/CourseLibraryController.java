package org.example.smart_schedulerbackend.controller;

import org.example.smart_schedulerbackend.model.dto.CourseLibraryDTO;
import org.example.smart_schedulerbackend.model.entity.CourseLibrary;
import org.example.smart_schedulerbackend.service.CourseLibraryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course-library")
public class CourseLibraryController {

    @Autowired
    private CourseLibraryService courseLibraryService;

    @GetMapping("/")
    public List<CourseLibraryDTO> getAllCourses() {
        return courseLibraryService.getAllCourses();
    }

    @GetMapping("/{courseNumber}")
    public CourseLibraryDTO getCourseByNumber(@PathVariable String courseNumber) {
        return courseLibraryService.getCourseByNumber(courseNumber);
    }

    @PostMapping
    public void insertCourse(@RequestBody CourseLibrary courseLibrary) {
        courseLibraryService.insertCourse(courseLibrary);
    }

    @PutMapping
    public void updateCourse(@RequestBody CourseLibrary courseLibrary) {
        courseLibraryService.updateCourse(courseLibrary);
    }

    @DeleteMapping("/{courseNumber}")
    public void deleteCourse(@PathVariable String courseNumber) {
        courseLibraryService.deleteCourse(courseNumber);
    }
}
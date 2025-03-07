package org.example.smart_schedulerbackend.service;

import org.example.smart_schedulerbackend.model.dto.CourseLibraryDTO;
import org.example.smart_schedulerbackend.model.entity.CourseLibrary;

import java.util.List;

public interface CourseLibraryService {
    List<CourseLibraryDTO> getAllCourses();
    CourseLibraryDTO getCourseByNumber(String courseNumber);
    void insertCourse(CourseLibrary courseLibrary);
    void updateCourse(CourseLibrary courseLibrary);
    void deleteCourse(String courseNumber);
}
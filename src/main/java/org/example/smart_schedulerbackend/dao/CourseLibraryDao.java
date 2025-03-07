package org.example.smart_schedulerbackend.dao;

import org.example.smart_schedulerbackend.model.entity.CourseLibrary;

import java.util.List;

public interface CourseLibraryDao {
    List<CourseLibrary> getAllCourses();
    CourseLibrary getCourseByNumber(String courseNumber);
    void insertCourse(CourseLibrary courseLibrary);
    void updateCourse(CourseLibrary courseLibrary);
    void deleteCourse(String courseNumber);
}
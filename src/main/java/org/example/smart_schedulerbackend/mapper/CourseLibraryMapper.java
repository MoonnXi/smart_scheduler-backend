package org.example.smart_schedulerbackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.smart_schedulerbackend.model.entity.CourseLibrary;

import java.util.List;

@Mapper
public interface CourseLibraryMapper {
    List<CourseLibrary> getAllCourses();
    CourseLibrary getCourseByNumber(String courseNumber);
    void insertCourse(CourseLibrary courseLibrary);
    void updateCourse(CourseLibrary courseLibrary);
    void deleteCourse(String courseNumber);
}
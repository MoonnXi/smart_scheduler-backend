package org.example.smart_schedulerbackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.smart_schedulerbackend.model.entity.ClassroomInformation;
import org.example.smart_schedulerbackend.model.entity.CourseLibrary;
import org.example.smart_schedulerbackend.model.entity.ProfessionalData;

import java.util.List;
import java.util.Map;

@Mapper
public interface CourseLibraryMapper {
    List<CourseLibrary> getAllCourses();
    CourseLibrary getCourseByNumber(String courseNumber);
    void insertCourse(CourseLibrary courseLibrary);
    void updateCourse(CourseLibrary courseLibrary);
    void deleteCourse(String courseNumber);
    List<CourseLibrary> getAllCourseInformation(Map<String,Object> param);
    List<CourseLibrary> getAllCourseProperties();
    long countCourseInformation(Map<String,Object> param);
}
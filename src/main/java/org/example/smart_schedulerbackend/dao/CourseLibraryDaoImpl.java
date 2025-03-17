package org.example.smart_schedulerbackend.dao;

import org.example.smart_schedulerbackend.model.entity.CourseLibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseLibraryDaoImpl implements CourseLibraryDao {
    // 模拟数据存储
    private Map<String, CourseLibrary> courseMap = new HashMap<>();

    @Override
    public List<CourseLibrary> getAllCourses() {
        return new ArrayList<>(courseMap.values());
    }

    @Override
    public CourseLibrary getCourseByNumber(String courseNumber) {
        return courseMap.get(courseNumber);
    }

    @Override
    public void insertCourse(CourseLibrary courseLibrary) {
        courseMap.put(courseLibrary.getCourseName(), courseLibrary);
    }

    @Override
    public void updateCourse(CourseLibrary courseLibrary) {
        if (courseMap.containsKey(courseLibrary.getCourseNumber())) {
            courseMap.put(courseLibrary.getCourseNumber(), courseLibrary);
        }
    }

    @Override
    public void deleteCourse(String courseNumber) {
        courseMap.remove(courseNumber);
    }
}
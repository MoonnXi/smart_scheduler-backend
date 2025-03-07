package org.example.smart_schedulerbackend.service.impl;

import org.example.smart_schedulerbackend.dao.CourseLibraryDao;
import org.example.smart_schedulerbackend.mapper.CourseLibraryMapper;
import org.example.smart_schedulerbackend.model.dto.CourseLibraryDTO;
import org.example.smart_schedulerbackend.model.entity.CourseLibrary;
import org.example.smart_schedulerbackend.service.CourseLibraryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseLibraryServiceImpl implements CourseLibraryService {

    @Autowired
    private CourseLibraryMapper courseLibraryMapper;

    @Override
    public List<CourseLibraryDTO> getAllCourses() {
        List<CourseLibrary> courses = courseLibraryMapper.getAllCourses();
        for (CourseLibrary c : courses) {
            System.out.println("courseNumber: " + c.getCourseNumber());
            System.out.println("courseName: " + c.getCourseName());
            System.out.println("department: " + c.getDepartment());
            // 打印其他字段...
        }
        return courses.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public CourseLibraryDTO getCourseByNumber(String courseNumber) {
        CourseLibrary course = courseLibraryMapper.getCourseByNumber(courseNumber);
        return convertToDTO(course);
    }

    @Override
    public void insertCourse(CourseLibrary courseLibrary) {
        courseLibraryMapper.insertCourse(courseLibrary);
    }

    @Override
    public void updateCourse(CourseLibrary courseLibrary) {
        courseLibraryMapper.updateCourse(courseLibrary);
    }

    @Override
    public void deleteCourse(String courseNumber) {
        courseLibraryMapper.deleteCourse(courseNumber);
    }

    private CourseLibraryDTO convertToDTO(CourseLibrary courseLibrary) {
        CourseLibraryDTO dto = new CourseLibraryDTO();
        BeanUtils.copyProperties(courseLibrary, dto);
        return dto;
    }
}
package org.example.smart_schedulerbackend.service.impl;

import org.example.smart_schedulerbackend.dao.CourseLibraryDao;
import org.example.smart_schedulerbackend.mapper.CourseLibraryMapper;
import org.example.smart_schedulerbackend.model.dto.CourseLibraryDTO;
import org.example.smart_schedulerbackend.model.entity.ClassroomInformation;
import org.example.smart_schedulerbackend.model.entity.CourseLibrary;
import org.example.smart_schedulerbackend.model.entity.ProfessionalData;
import org.example.smart_schedulerbackend.model.entity.Teacher;
import org.example.smart_schedulerbackend.service.CourseLibraryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    @Override
    public List<CourseLibrary> getAllCourseInformation(String department, String courseProperties,int page,int size)
    {
        Map<String,Object> mapx = new HashMap<>();
        mapx.put("department",department);
        mapx.put("courseProperties",courseProperties);
        List<CourseLibrary> dataMap = courseLibraryMapper.getAllCourseInformation(mapx);
        int start = (page - 1) * size;
        int end = Math.min(start + size, dataMap.size());
        if (start >= dataMap.size()) {
            return List.of();
        }
        return dataMap.subList(start,end);
    }

    @Override
    public List<Map<String,Object>> getAllCourseProperties()
    {
        List<Map<String,Object>> resultList = new ArrayList<>();
        List<CourseLibrary> dataMap = courseLibraryMapper.getAllCourseProperties();
        for(CourseLibrary classInfo : dataMap)
        {
            Map<String,Object> map = new HashMap<>();
            map.put("courseproperties",classInfo.getCourseProperties());
            resultList.add(map);
        }
        return resultList;
    };

    @Override
    public Map<String,Object> countCourseInformation(String department, String courseProperties)
    {
        Map<String,Object> mapx = new HashMap<>();
        mapx.put("department",department);
        mapx.put("courseProperties",courseProperties);
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("number",courseLibraryMapper.countCourseInformation(mapx));
        return dataMap;
    };
}
package org.example.smart_schedulerbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.smart_schedulerbackend.mapper.CourseLibraryMapper;
import org.example.smart_schedulerbackend.model.dto.CourseLibraryDTO;
import org.example.smart_schedulerbackend.model.entity.CourseLibrary;
import org.example.smart_schedulerbackend.service.CourseLibraryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseLibraryServiceImpl extends ServiceImpl<CourseLibraryMapper, CourseLibrary> implements CourseLibraryService {

    @Override
    public List<CourseLibraryDTO> getAllCourses() {
        // 这里可以进行 DTO 转换
        return baseMapper.selectList(null).stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public CourseLibraryDTO getCourseByNumber(String courseNumber) {
        CourseLibrary courseLibrary = baseMapper.selectById(courseNumber);
        return convertToDTO(courseLibrary);
    }

    @Override
    public void insertCourse(CourseLibrary courseLibrary) {
        baseMapper.insert(courseLibrary);
    }

    @Override
    public void updateCourse(CourseLibrary courseLibrary) {
        baseMapper.updateById(courseLibrary);
    }

    @Override
    public void deleteCourse(String courseNumber) {
        baseMapper.deleteById(courseNumber);
    }

    private CourseLibraryDTO convertToDTO(CourseLibrary courseLibrary) {
        if (courseLibrary == null) {
            return null;
        }
        CourseLibraryDTO dto = new CourseLibraryDTO();
        // 进行属性转换
        dto.setCourseNumber(courseLibrary.getCourseNumber());
        dto.setCourseName(courseLibrary.getCourseName());
        dto.setCourseCategories(courseLibrary.getCourseCategories());
        dto.setCourseType(courseLibrary.getCourseType());
        dto.setDepartment(courseLibrary.getDepartment());
        dto.setEnabledStatus(courseLibrary.getEnabledStatus());
        dto.setCredits(String.valueOf(courseLibrary.getCredits())); // 如果 credits 是数值类型，需转换为 String
        dto.setWeeklyHours(String.valueOf(courseLibrary.getWeeklyHours())); // 同上
        return dto;
    }
}

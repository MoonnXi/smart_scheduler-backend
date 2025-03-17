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
    public List<CourseLibrary> getAllCourses() {
        return list();
    }
}
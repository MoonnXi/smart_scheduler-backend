package org.example.smart_schedulerbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.smart_schedulerbackend.model.dto.CourseLibraryDTO;
import org.example.smart_schedulerbackend.model.entity.CourseLibrary;

import java.util.List;

public interface CourseLibraryService extends IService<CourseLibrary> {
    List<CourseLibrary> getAllCourses();
}
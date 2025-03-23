package org.example.smart_schedulerbackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.smart_schedulerbackend.model.entity.Teacher;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeacherMapper {
    List<Teacher> getAllTeacherInformation(String department);
    long countTeacherInformation(String department);
}

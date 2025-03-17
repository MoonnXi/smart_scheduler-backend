package org.example.smart_schedulerbackend.service;

import org.example.smart_schedulerbackend.model.dto.TeacherDTO;

import java.util.List;

public interface TeacherService {
    List<TeacherDTO> getAllTeachers();
}

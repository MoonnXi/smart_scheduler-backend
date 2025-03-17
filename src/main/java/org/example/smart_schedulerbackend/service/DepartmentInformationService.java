package org.example.smart_schedulerbackend.service;

import org.example.smart_schedulerbackend.model.dto.DepartmentInformationDTO;

import java.util.List;

public interface DepartmentInformationService {
    List<DepartmentInformationDTO> getAllDepartments();
}

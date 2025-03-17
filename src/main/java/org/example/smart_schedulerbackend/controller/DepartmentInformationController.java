package org.example.smart_schedulerbackend.controller;

import org.example.smart_schedulerbackend.model.dto.DepartmentInformationDTO;
import org.example.smart_schedulerbackend.service.DepartmentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentInformationController {

    @Autowired
    private DepartmentInformationService departmentInformationService;

    @GetMapping("/departments")
    public List<DepartmentInformationDTO> getAllDepartments() {
        return departmentInformationService.getAllDepartments();
    }
}

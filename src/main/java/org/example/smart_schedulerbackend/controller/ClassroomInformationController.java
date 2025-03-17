package org.example.smart_schedulerbackend.controller;

import org.example.smart_schedulerbackend.model.dto.ClassroomInformationDTO;
import org.example.smart_schedulerbackend.service.ClassroomInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassroomInformationController {

    @Autowired
    private ClassroomInformationService classroomInformationService;

    @GetMapping("/school-districts")
    public List<String> getAllSchoolDistricts() {
        return classroomInformationService.getAllSchoolDistricts();
    }

    @GetMapping("/school-buildings")
    public List<String> getSchoolBuildingsBySchoolDistricts(@RequestParam String schoolDistricts) {
        return classroomInformationService.getSchoolBuildingsBySchoolDistricts(schoolDistricts);
    }

    @GetMapping("/classrooms")
    public List<ClassroomInformationDTO> getClassroomInformationsBySchoolBuilding(@RequestParam String schoolBuilding) {
        return classroomInformationService.getClassroomInformationsBySchoolBuilding(schoolBuilding);
    }
}

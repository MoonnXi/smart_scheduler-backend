package org.example.smart_schedulerbackend.service;

import org.example.smart_schedulerbackend.model.dto.ClassroomInformationDTO;
import org.example.smart_schedulerbackend.model.entity.ClassInformation;

import java.util.List;

public interface ClassroomInformationService {
    List<String> getAllSchoolDistricts();
    List<String> getSchoolBuildingsBySchoolDistricts(String schoolDistricts);
    List<ClassroomInformationDTO> getClassroomInformationsBySchoolBuilding(String schoolBuilding);
}

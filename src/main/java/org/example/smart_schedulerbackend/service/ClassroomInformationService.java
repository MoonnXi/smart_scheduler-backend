package org.example.smart_schedulerbackend.service;

import org.example.smart_schedulerbackend.model.entity.ClassroomInformation;
import org.example.smart_schedulerbackend.tools.PageResult;

import java.util.List;
import java.util.Map;

public interface ClassroomInformationService {
    List<ClassroomInformation> getAllClassroomInformation(String schoolDistricts, String schoolBuilding,int page,int size);
    Map<String,Object> countClassroomInformation(String schoolDistricts, String schoolBuilding);
}

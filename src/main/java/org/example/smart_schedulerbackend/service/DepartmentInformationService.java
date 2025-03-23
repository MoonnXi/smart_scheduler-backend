package org.example.smart_schedulerbackend.service;

import org.example.smart_schedulerbackend.model.entity.DepartmentInformation;

import java.util.List;
import java.util.Map;

public interface DepartmentInformationService {
    List<Map<String,Object>> getAllDepartmentInformation(int page, int size);
    Map<String,Object> countDepartmentInformation();
}

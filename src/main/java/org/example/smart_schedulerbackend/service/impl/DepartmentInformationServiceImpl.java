package org.example.smart_schedulerbackend.service.impl;

import org.example.smart_schedulerbackend.mapper.DepartmentInformationMapper;
import org.example.smart_schedulerbackend.model.entity.DepartmentInformation;
import org.example.smart_schedulerbackend.model.entity.ProfessionalData;
import org.example.smart_schedulerbackend.service.DepartmentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentInformationServiceImpl implements DepartmentInformationService {
    @Autowired
    private DepartmentInformationMapper departmentInformationMapper;

    @Override
    public List<Map<String,Object>> getAllDepartmentInformation(int page,int size)
    {
        List<Map<String,Object>> resultList = new ArrayList<>();
        List<DepartmentInformation> dataMap = departmentInformationMapper.getAllDepartmentInformation();
        for(DepartmentInformation classInfo : dataMap)
        {
            Map<String,Object> map = new HashMap<>();
            map.put("departmentNumber",classInfo.getDepartmentNumber());
            map.put("departmentName",classInfo.getDepartmentName());
            map.put("organizationType",classInfo.getOrganizationType());
            resultList.add(map);
        }
        int start = (page - 1) * size;
        int end = Math.min(start + size, dataMap.size());
        if (start >= resultList.size()) {
            return List.of();
        }
        return resultList.subList(start,end);
    };

    @Override
    public Map<String,Object> countDepartmentInformation()
    {
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("number",departmentInformationMapper.countDepartmentInformation());
        return dataMap;
    };
}

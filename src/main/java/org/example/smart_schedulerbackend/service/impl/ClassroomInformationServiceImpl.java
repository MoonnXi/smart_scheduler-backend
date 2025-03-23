package org.example.smart_schedulerbackend.service.impl;

import org.example.smart_schedulerbackend.mapper.ClassInformationMapper;
import org.example.smart_schedulerbackend.mapper.ClassroomInformationMapper;
import org.example.smart_schedulerbackend.model.entity.ClassroomInformation;
import org.example.smart_schedulerbackend.model.entity.Remark;
import org.example.smart_schedulerbackend.service.ClassInformationService;
import org.example.smart_schedulerbackend.service.ClassroomInformationService;
import org.example.smart_schedulerbackend.tools.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClassroomInformationServiceImpl implements ClassroomInformationService {
    @Autowired
    private ClassroomInformationMapper classroomInformationMapper;

    @Override
    public List<ClassroomInformation> getAllClassroomInformation(String schoolDistricts, String schoolBuilding,int page,int size)
    {
        Map<String,Object> mapx = new HashMap<>();
        mapx.put("schoolDistricts",schoolDistricts);
        mapx.put("schoolBuilding",schoolBuilding);
        List<ClassroomInformation> dataMap = classroomInformationMapper.getAllClassroomInformation(mapx);
        int start = (page - 1) * size;
        int end = Math.min(start + size, dataMap.size());
        if (start >= dataMap.size()) {
            return List.of();
        }
        return dataMap.subList(start,end);
    }

    @Override
    public Map<String,Object> countClassroomInformation(String schoolDistricts, String schoolBuilding)
    {
        Map<String,Object> mapx = new HashMap<>();
        mapx.put("schoolDistricts",schoolDistricts);
        mapx.put("schoolBuilding",schoolBuilding);
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("number",classroomInformationMapper.countClassroomInformation(mapx));
        return dataMap;
    };
}

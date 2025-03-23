package org.example.smart_schedulerbackend.service.impl;

import org.example.smart_schedulerbackend.mapper.ProfessionalDataMapper;
import org.example.smart_schedulerbackend.model.entity.ClassInformation;
import org.example.smart_schedulerbackend.model.entity.ProfessionalData;
import org.example.smart_schedulerbackend.service.ProfessionalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProfessionalDataServiceImpl implements ProfessionalDataService {
    @Autowired
    private ProfessionalDataMapper professionalDataMapper;

    @Override
    public List<Map<String,Object>> getAllProfessionalData()
    {
        List<Map<String,Object>> resultList = new ArrayList<>();
        List<ProfessionalData> dataMap = professionalDataMapper.getAllProfessionalData();
        for(ProfessionalData classInfo : dataMap)
        {
            Map<String,Object> map = new HashMap<>();
            map.put("professionalname",classInfo.getProfessionalName());
            resultList.add(map);
        }
        return resultList;
    }
}

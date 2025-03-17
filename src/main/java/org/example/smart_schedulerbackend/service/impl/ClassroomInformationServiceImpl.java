package org.example.smart_schedulerbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.smart_schedulerbackend.mapper.ClassroomInformationMapper;
import org.example.smart_schedulerbackend.model.dto.ClassroomInformationDTO;
import org.example.smart_schedulerbackend.model.entity.ClassroomInformation;
import org.example.smart_schedulerbackend.service.ClassroomInformationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomInformationServiceImpl extends ServiceImpl<ClassroomInformationMapper, ClassroomInformation> implements ClassroomInformationService {

    @Override
    public List<String> getAllSchoolDistricts() {
        return baseMapper.getAllSchoolDistricts();
    }

    @Override
    public List<String> getSchoolBuildingsBySchoolDistricts(String schoolDistricts) {
        return baseMapper.getSchoolBuildingsBySchoolDistricts(schoolDistricts);
    }

    @Override
    public List<ClassroomInformationDTO> getClassroomInformationsBySchoolBuilding(String schoolBuilding) {
        return baseMapper.getClassroomInformationsBySchoolBuilding(schoolBuilding);
    }
}

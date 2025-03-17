package org.example.smart_schedulerbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.smart_schedulerbackend.mapper.DepartmentInformationMapper;
import org.example.smart_schedulerbackend.model.dto.DepartmentInformationDTO;
import org.example.smart_schedulerbackend.model.entity.DepartmentInformation;
import org.example.smart_schedulerbackend.service.DepartmentInformationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentInformationServiceImpl extends ServiceImpl<DepartmentInformationMapper, DepartmentInformation> implements DepartmentInformationService {

    @Override
    public List<DepartmentInformationDTO> getAllDepartments() {
        return baseMapper.getAllDepartments();
    }
}

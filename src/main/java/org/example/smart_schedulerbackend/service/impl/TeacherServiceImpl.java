package org.example.smart_schedulerbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.smart_schedulerbackend.mapper.TeacherMapper;
import org.example.smart_schedulerbackend.model.dto.TeacherDTO;
import org.example.smart_schedulerbackend.model.entity.TeacherInformation;
import org.example.smart_schedulerbackend.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, TeacherInformation> implements TeacherService {

    @Override
    public List<TeacherDTO> getAllTeachers() {
        return baseMapper.getAllTeachers();
    }
}

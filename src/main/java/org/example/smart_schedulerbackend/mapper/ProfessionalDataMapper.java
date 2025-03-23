package org.example.smart_schedulerbackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.smart_schedulerbackend.model.entity.ProfessionalData;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProfessionalDataMapper {
    List<ProfessionalData> getAllProfessionalData();
}

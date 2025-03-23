package org.example.smart_schedulerbackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.smart_schedulerbackend.model.entity.ClassroomInformation;

import java.util.List;
import java.util.Map;

@Mapper
public interface ClassroomInformationMapper {
    List<ClassroomInformation> getAllClassroomInformation(Map<String,Object> param);
    long countClassroomInformation(Map<String,Object> param);
}

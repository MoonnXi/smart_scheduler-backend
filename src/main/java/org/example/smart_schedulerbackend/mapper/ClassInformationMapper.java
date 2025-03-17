package org.example.smart_schedulerbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.smart_schedulerbackend.model.dto.ClassInformationDTO;
import org.example.smart_schedulerbackend.model.entity.ClassInformation;

import java.util.List;

@Mapper
public interface ClassInformationMapper extends BaseMapper<ClassInformation> {

    @Select("SELECT class_number, class_name, class_size FROM class_information WHERE major = #{major}")
    List<ClassInformationDTO> getClassInformationsByMajor(String major);
}

package org.example.smart_schedulerbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.smart_schedulerbackend.model.dto.ClassroomInformationDTO;
import org.example.smart_schedulerbackend.model.entity.ClassroomInformation;

import java.util.List;

@Mapper
public interface ClassroomInformationMapper extends BaseMapper<ClassroomInformation> {

    @Select("SELECT DISTINCT school_districts FROM classroom_information")
    List<String> getAllSchoolDistricts();

    @Select("SELECT DISTINCT school_building FROM classroom_information WHERE school_districts = #{schoolDistricts}")
    List<String> getSchoolBuildingsBySchoolDistricts(String schoolDistricts);

    @Select("SELECT classroom_name, classroom_type, floor FROM classroom_information WHERE school_building = #{schoolBuilding}")
    List<ClassroomInformationDTO> getClassroomInformationsBySchoolBuilding(String schoolBuilding);
}

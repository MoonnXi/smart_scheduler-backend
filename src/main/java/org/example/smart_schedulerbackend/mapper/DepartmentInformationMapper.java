package org.example.smart_schedulerbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.smart_schedulerbackend.model.entity.DepartmentInformation;
import org.example.smart_schedulerbackend.model.dto.DepartmentInformationDTO;

import java.util.List;

@Mapper
public interface DepartmentInformationMapper extends BaseMapper<DepartmentInformation> {

    @Select("SELECT * FROM department_information")
    List<DepartmentInformationDTO> getAllDepartments();
}

package org.example.smart_schedulerbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.smart_schedulerbackend.model.entity.TeacherInformation;
import org.example.smart_schedulerbackend.model.dto.TeacherDTO;

import java.util.List;

@Mapper
public interface TeacherMapper extends BaseMapper<TeacherInformation> {

    @Select("SELECT * FROM teacher_information")
    List<TeacherDTO> getAllTeachers();
}

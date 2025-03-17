package org.example.smart_schedulerbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.smart_schedulerbackend.model.entity.CourseLibrary;

@Mapper
public interface CourseLibraryMapper extends BaseMapper<CourseLibrary> {
    //自定义的 SQL 方法
}

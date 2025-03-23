package org.example.smart_schedulerbackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.smart_schedulerbackend.model.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
    User getUserById(String id);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(User user);
}
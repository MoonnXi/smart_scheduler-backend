package org.example.smart_schedulerbackend.service.impl;
import org.example.smart_schedulerbackend.model.entity.User;
import org.example.smart_schedulerbackend.mapper.UserMapper;
import org.example.smart_schedulerbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean register(User user){
        User user1 = userMapper.getUserById(user.getId());
        if(user1 != null)
        {
            return false;
        }
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        user.setIsDeleted(0);
        int rows = userMapper.insertUser(user);
        return rows > 0;
    }

    @Override
    public boolean login(String id,String password){
        User user = userMapper.getUserById(id);
        if(user != null && user.getPassword().equals(password))
        {
            return true;
        }
        return false;
    }
}

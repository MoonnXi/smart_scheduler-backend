package org.example.smart_schedulerbackend.service;
import org.example.smart_schedulerbackend.model.entity.User;
public interface UserService {
    boolean register(User user);
    boolean login(String username,String password);
}

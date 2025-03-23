package org.example.smart_schedulerbackend.controller;
import org.example.smart_schedulerbackend.model.entity.User;
import org.example.smart_schedulerbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.example.smart_schedulerbackend.tools.ResponseResult;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Map<String, Object>> register(@RequestBody User user) {
        Map<String, Object> response = new HashMap<>();
        if (userService.register(user)) {
            response.put("code", 1);
            response.put("message", "注册成功");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.put("code", 0);
            response.put("message", "注册失败，用户名已存在");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestParam String id, @RequestParam String password) {
        Map<String, Object> response = new HashMap<>();
        if (userService.login(id, password)) {
            response.put("code", 1);
            response.put("message", "登录成功");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.put("code", 0);
            response.put("message", "登录失败，用户名或密码错误");
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }
    }

//    @PostMapping("/register")
//    public ResponseResult<String> register(@RequestBody User user)
//    {
//        if(userService.register(user))
//        {
//            return ResponseResult.success("注册成功", null);
//        }
//        else
//        {
//            return ResponseResult.fail("注册失败，用户名已存在");
//        }
//    }
//
//    @PostMapping("/login")
//    public ResponseResult<String> login(@RequestParam String id, @RequestParam String password)
//    {
//        if(userService.login(id,password))
//        {
//            return ResponseResult.success("登录成功", null);
//        }
//        else
//        {
//            return ResponseResult.fail( "登录失败，用户名或密码错误");
//        }
//    }
}


//    public String login(@RequestParam String id, @RequestParam String password)
//    {
//        if(userService.login(id,password))
//        {
//            return "登录成功";
//        }
//        else
//        {
//            return "登录失败，用户名或密码错误";
//        }
//    }
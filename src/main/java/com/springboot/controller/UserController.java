package com.springboot.controller;


import com.springboot.entity.User;
import com.springboot.service.UserServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.annotation.Resource;
import java.util.List;

@EnableAutoConfiguration
public class UserController {

@Resource(name="userService")
    private UserServiceImpl userService;

public String findAll(){
    List<User> list=userService.findAll();
    return "list";
}

}

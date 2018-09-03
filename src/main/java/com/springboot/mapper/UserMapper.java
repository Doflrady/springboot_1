package com.springboot.mapper;

import com.springboot.entity.User;

import java.util.List;

public interface UserMapper {
    public List<User> findAll();
}

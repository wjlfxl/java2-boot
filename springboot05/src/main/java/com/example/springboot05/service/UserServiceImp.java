package com.example.springboot05.service;

import com.example.springboot05.mapper.UserMapper;
import com.example.springboot05.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("UserService")
public class UserServiceImp implements UserService{
    @Autowired
    UserMapper userMapper;


    @Override
    public User userByNP(String name, Integer passwd) {
        return userMapper.userByNP(name, passwd);
    }
}

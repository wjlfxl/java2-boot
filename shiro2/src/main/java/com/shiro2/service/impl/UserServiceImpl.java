package com.shiro2.service.impl;

import com.shiro2.mapper.UserMapper;
import com.shiro2.pojo.User;
import com.shiro2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public User userByName(String name) {
        return userMapper.userByName(name);
    }

    @Override
    public User userByNP(String name, Integer passwd) {
        return userMapper.userByNP(name, passwd);
    }
}

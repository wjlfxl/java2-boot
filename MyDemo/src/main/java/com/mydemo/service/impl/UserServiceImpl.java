package com.mydemo.service.impl;

import com.mydemo.mapper.UserMapper;
import com.mydemo.pojo.User;
import com.mydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public User userByIdName(String value) {
        return userMapper.userByIdName(value);
    }

    @Override
    public User userById(Integer id) {
        return userMapper.userById(id);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public int upDateUser(User user) {
        return userMapper.upDateUser(user);
    }


//    @Override
//    public User userByName(String name) {
//        return userMapper.userByName(name);
//    }

}

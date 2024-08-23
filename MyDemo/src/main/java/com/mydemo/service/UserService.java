package com.mydemo.service;

import com.mydemo.pojo.User;
import java.util.List;

public interface UserService {

    List<User> queryUserList();

    User userById(Integer id);

    User userByIdName(String value);

    int addUser(User user);

    int deleteUser(Integer id);

    int upDateUser(User user);


//    User userByName(String name);

}

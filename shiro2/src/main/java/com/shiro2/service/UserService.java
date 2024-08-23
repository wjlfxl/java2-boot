package com.shiro2.service;


import com.shiro2.pojo.User;

import java.util.List;

public interface UserService {

    List<User> queryUserList();

    User userByName(String name);

    User userByNP(String name,Integer passwd);


}

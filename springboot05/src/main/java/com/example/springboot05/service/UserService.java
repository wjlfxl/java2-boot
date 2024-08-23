package com.example.springboot05.service;

import com.example.springboot05.pojo.User;

public interface UserService {

    User userByNP(String name, Integer passwd);

}

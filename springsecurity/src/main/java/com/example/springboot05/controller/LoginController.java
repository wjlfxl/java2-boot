package com.example.springboot05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Repository
public class LoginController {

    @RequestMapping({"/toLogin"})
//    @ResponseBody   //不走视图解析器了
    public String login() {
        return "login";
    }
}

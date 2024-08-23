package com.example.springboot05.controller;

import com.example.springboot05.pojo.User;
import com.example.springboot05.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {

    @Autowired
    private UserService userService;

    @RequestMapping({"/user/login"})
//    @ResponseBody   //不走视图解析器了
    public String login(@RequestParam("username") String username, @RequestParam("password") Integer password, Model model, HttpSession session){

        User user=userService.userByNP(username,password);
        //具体业务
        if (user!= null){
            session.setAttribute("loginUser",username);
            return "dashboard";
        }else {
                model.addAttribute("msg", "用户名或者密码错误");
                return "index";
    }
}
}

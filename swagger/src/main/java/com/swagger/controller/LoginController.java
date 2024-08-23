package com.swagger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    //跳转到登陆页面
    @RequestMapping("/toLogin")
    public String login() {
        return "login";
    }

    //通过
    @RequestMapping("/user/toLogin")
    public String toLogin(@RequestParam("username") String username, @RequestParam("password") Integer password, Model model, HttpSession session) {
        if(username.equals("www") & password.equals("123")){
            session.setAttribute("logUser",username);
            return "index";
        }else {
            model.addAttribute("msg", "密码错误");
            return "login";
        }


    }

    //退出
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }

}

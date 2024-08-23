package com.shiro2.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    //跳转到登陆页面
    @RequestMapping("/toLogin")
    public String login() {
        return "login";
    }

    //认证通过
    @RequestMapping("/user/toLogin")
    public String toLogin(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
        //获得当前用户数据
        Subject subject = SecurityUtils.getSubject();

        //封装用户登陆数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        //执行登陆的方法。如果没有问题就ok，有就捕获异常
        try {
            subject.login(token);
            Subject currentSubject = SecurityUtils.getSubject();
            Session session1 = currentSubject.getSession();
            session.setAttribute("loginUser",session1);

            return "index";

        }catch (UnknownAccountException e){
            //用户名不存在
            model.addAttribute("msg","用户名不存在");
            return "login";
        }catch (IncorrectCredentialsException e) {
            //密码错误
            model.addAttribute("msg", "密码不存在");
            return "login";
        }
    }

    //未授权跳转
    @RequestMapping("/noAuthorize")
    @ResponseBody
    public String authorize() {
        return "未授权";
    }

    //退出
    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }

}

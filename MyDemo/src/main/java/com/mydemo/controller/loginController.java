package com.mydemo.controller;

import com.mydemo.pojo.Admin;
import com.mydemo.service.AdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {

    @Autowired
    private AdminService adminService;

    //跳转到登陆页面
    @RequestMapping({"/toLogin","/index","/"})
    public String login() {
        return "index";
    }

    //认证通过
    @PostMapping ("/user/login")
//    @ResponseBody
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
//
            return "redirect:/dashboard";

        }catch (UnknownAccountException e){
            //用户名不存在
            model.addAttribute("msg","用户名错误");
            return "index";
        }catch (IncorrectCredentialsException e) {
            //密码错误
            model.addAttribute("msg", "密码错误");
            return "index";
        }
    }

    //退出
    @RequestMapping("/out")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "index";
    }

//    @RequestMapping({"/user/login"})
////    @ResponseBody   //不走视图解析器了
//    public String login(@RequestParam("username") String username, @RequestParam("password") Integer password, Model model, HttpSession session){
//
//        Admin admin=adminService.adminByNP(username,password);
//        //具体业务
//        if (admin!= null){
//            session.setAttribute("loginUser",username);
//            return "dashboard";
//        }else {
//                model.addAttribute("msg", "用户名或者密码错误");
//                return "index";
//    }
//}
}

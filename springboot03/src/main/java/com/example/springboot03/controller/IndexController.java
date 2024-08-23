package com.example.springboot03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

//在templates中的页面只能通过controller跳转
//需要摸版引擎的支持
@Controller
public class IndexController {
    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","<h1>hello,spring</h1>");
        model.addAttribute("users", Arrays.asList("wjl","try"));
        return "test";
    }
}

package com.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

    @RequestMapping({"/","/index"})
    public String index(Model model){
        model.addAttribute("msg", "hello");
        return "index";
    }

    @RequestMapping("/orders")
    public String list(){
        return "Orders/list";
    }

    @RequestMapping("/products")
    public String ProductsList(){
        return "Products/list";
    }

    @RequestMapping("/emps")
    public String list(Model model){
        return "emp/list";
    }
}

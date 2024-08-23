package com.example.springboot05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/orders")
//    @PreAuthorize(value = "hasAnyRole('admin')")
    public String list(){
        return "Orders/list";
    }

    @RequestMapping("/products")
//    @PreAuthorize(value = "hasAnyRole('normal')")
    public String ProductsList(){
        return "Products/list";
    }

    //得到全部的员工
    @RequestMapping("/emps")
    public String list(Model model){
        return "emp/list";
    }
}

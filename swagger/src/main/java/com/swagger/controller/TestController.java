package com.swagger.controller;

import com.swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Api(tags = "测试")
@Controller
public class TestController {

    @GetMapping({"/","/index"})
    public String index(Model model){
//        model.addAttribute("msg", "hello");
        return "index";
    }

    //只要我们的接口中，返回值中存在实体类，他就会被扫描到Swagger中
    @RequestMapping("/hello")
    public User user(){
        return new User();
    }

    @ApiOperation("订购")
    @RequestMapping("/orders")
    public String orderlist(){
        return "Orders/list";
    }

    @ApiOperation("产品")
    @RequestMapping("/products")
    public String Productlist(@ApiParam("名字") String name){
        return "Users/list";
    }

    @PostMapping("/user")
    @ResponseBody
    public User UserList(@ApiParam("类") User user){
        return user;
    }

}

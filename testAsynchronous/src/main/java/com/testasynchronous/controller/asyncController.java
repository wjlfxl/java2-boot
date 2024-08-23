package com.testasynchronous.controller;

import com.testasynchronous.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class asyncController {

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        asyncService.hello();
        return "ok";
    }
}

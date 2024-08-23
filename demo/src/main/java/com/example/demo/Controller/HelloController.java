package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello() {
        return "helloWorld";
    }
}

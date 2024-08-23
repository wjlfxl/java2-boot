package com.mydemo.controller;

import com.mydemo.pojo.User;
import com.mydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public String AllList(Model model){
        List<User> userList = userService.queryUserList();
        model.addAttribute("users",userList);
        return "userShow/list";
    }

//查询
    @RequestMapping("/toFindUser")
    public String FindUser(@RequestParam("select") String value, Model model){
        User userList = userService.userByIdName(value);
        model.addAttribute("users",userList);
        return "userShow/list";
    }

    //跳转去添加页面
    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "userShow/addUser";
    }
//    添加
    @RequestMapping("/addUser")
    public String AddUser(User user){
        userService.addUser(user);
        return "redirect:/users";
    }

    @RequestMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return "redirect:/users";
    }

    //按id查询
    @GetMapping("/toUpdateUser/{id}")
    public String toUpDate(@PathVariable("id") int id, Model model){
        //按id查询
        User userList=userService.userById(id);
        model.addAttribute("userList",userList);
        return "userShow/update";
    }

    //修改完成
    @PostMapping("/updateUser")
    public String upDateUser(User user){
        //修改的操作
        userService.upDateUser(user);   //调用底层业务方法保存员工的信息
        return "redirect:/users";
    }
}

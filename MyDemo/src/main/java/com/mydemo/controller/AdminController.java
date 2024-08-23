package com.mydemo.controller;

import com.mydemo.pojo.Admin;
import com.mydemo.pojo.Merchant;
import com.mydemo.service.AdminService;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping({"/toupdateAdmin"})
    public String toUpdateAdmin(HttpSession session,Model model) {
        String name= String.valueOf(session.getAttribute("loginUser"));
        //按session查询
        Admin adminList=adminService.adminByName(name);
        model.addAttribute("admin",adminList);
        return "admin/updateAdmin";
    }
        //修改完成
        @RequestMapping("/UpdateAdmin")
        public String upDateAdmin(Admin admin){
            //修改的操作
            adminService.upDateAdmin(admin);   //调用底层业务方法
            return "redirect:/admin";
        }

    @RequestMapping("/deleteAdmin/{name}")
    public String deleteAdmin(@PathVariable("name") String name){
        adminService.deleteAdmin("name");
        return "redirect:/admin";
    }
}

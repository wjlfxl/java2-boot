package com.mydemo.controller;

import com.mydemo.pojo.Merchant;
import com.mydemo.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    @RequestMapping("/merchant")
    public String List(Model model){
        List<Merchant> merchantList=merchantService.queryMerchantList();
        model.addAttribute("merchant",merchantList);
        return "Merchant/list";
    }

    //跳转去添加页面
    @RequestMapping("/toAddMerchant")
    public String toAddMerchant(){
        return "Merchant/addMerchant";
    }
    //    添加
    @RequestMapping("/addMerchant")
    public String AddMerchant(Merchant merchant){
        merchantService.addMerchant(merchant);
        return "redirect:/merchant";
    }

    //按id删除
    @RequestMapping("/deleteMerchant/{id}")
    public String deleteMerchant(@PathVariable("id") Integer id){
        merchantService.deleteMerchant(id);
        return "redirect:/merchant";
    }


    //修改第一步，按id查询
    @GetMapping("/toUpdateMerchant/{id}")
    public String toUpDateMerchant(@PathVariable("id") Integer id, Model model){
        //按id查询
        Merchant merchantList=merchantService.merchantById(id);
        model.addAttribute("merchantList",merchantList);
        return "Merchant/update";
    }

    //修改完成
    @RequestMapping("/updateMerchant")
    public String upDateMerchant(Merchant merchant){
        //修改的操作
        merchantService.upDateMerchant(merchant);   //调用底层业务方法
        return "redirect:/merchant";
    }

}

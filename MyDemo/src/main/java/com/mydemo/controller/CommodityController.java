package com.mydemo.controller;

import com.mydemo.pojo.Commodity;
import com.mydemo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    @RequestMapping("/commodity")
    public String CommodityList(Model model){
        List<Commodity> commodityList=commodityService.queryCommodityList();
        model.addAttribute("commodity",commodityList);
        return "Commodity/list";
    }

    //跳转去添加页面
    @RequestMapping("/toAddCommodity")
    public String toAddCommodity(){
        return "Commodity/addCommodity";
    }
//    添加
    @RequestMapping("/addCommodity")
    public String AddCommodity(Commodity commodity){
        commodityService.addCommodity(commodity);
        return "redirect:/commodity";
    }

    //按id删除
    @RequestMapping("/deleteCommodity/{id}")
    public String deleteCommodity(@PathVariable("id") Integer id){
        commodityService.deleteCommodity(id);
        return "redirect:/commodity";
    }


    //修改第一步，按id查询
    @GetMapping("/toUpdateCommodity/{id}")
    public String toUpDate(@PathVariable("id") Integer id, Model model){
        //按id查询
        Commodity commodityList=commodityService.commodityById(id);
        model.addAttribute("commodityList",commodityList);
        return "Commodity/update";
    }

    //修改完成
    @RequestMapping("/updateCommodity")
    public String upDateCommodity(Commodity commodity){
        //修改的操作
        commodityService.upDateCommodity(commodity);   //调用底层业务方法
        return "redirect:/commodity";
    }

}

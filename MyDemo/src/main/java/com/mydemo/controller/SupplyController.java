package com.mydemo.controller;

import com.mydemo.pojo.Supply;
import com.mydemo.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SupplyController {
    @Autowired
    private SupplyService supplyService;

    @RequestMapping("/supply")
    public String List(Model model){
        List<Supply> supplyList=supplyService.querySupplyList();
        model.addAttribute("supplyList",supplyList);
        return "supply/list";
    }

//    //删除
//    @RequestMapping("/del/{id}")
//    public String List(@PathVariable("id")int id, Model model){
//        supplyService.delSupply();
//        return "supply/list";
//    }


}

package com.mydemo.controller;

import com.mydemo.pojo.Merchant;
import com.mydemo.pojo.Stock;
import com.mydemo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StockController {
    @Autowired
    private StockService stockService;

    @RequestMapping("/stock")
    public String List(Model model){
        List<Stock> stockList=stockService.queryStockList();
        model.addAttribute("stocks",stockList);
        return "stock/list";
    }

    //跳转去添加页面
    @RequestMapping("/toAddStock")
    public String toAddStock(){
        return "stock/addStock";
    }
    //    添加
    @RequestMapping("/addStock")
    public String AddStock(Stock stock){
        stockService.addStock(stock);
        return "redirect:/stock";
    }
//
//    //按id删除
//    @RequestMapping("/deleteMerchant/{id}")
//    public String deleteMerchant(@PathVariable("id") Integer id){
//        merchantService.deleteMerchant(id);
//        return "redirect:/merchant";
//    }
//
//
//    //修改第一步，按id查询
//    @GetMapping("/toUpdateMerchant/{id}")
//    public String toUpDateMerchant(@PathVariable("id") Integer id, Model model){
//        //按id查询
//        Merchant merchantList=merchantService.merchantById(id);
//        model.addAttribute("merchantList",merchantList);
//        return "Merchant/update";
//    }
//
//    //修改完成
//    @RequestMapping("/updateMerchant")
//    public String upDateMerchant(Merchant merchant){
//        //修改的操作
//        merchantService.upDateMerchant(merchant);   //调用底层业务方法
//        return "redirect:/merchant";
//    }

}

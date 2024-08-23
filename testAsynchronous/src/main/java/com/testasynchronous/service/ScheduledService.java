package com.testasynchronous.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    //在特定时间执行方法   timer


    //cron表达式
    //秒  分  时  日  月  周几～
    //任何日月时分的星期一到星期天的第0秒会执行
    @Scheduled(cron="0 50 * * * 0-7")
    public void hello(){
        System.out.println("你被执行了");
    }
}

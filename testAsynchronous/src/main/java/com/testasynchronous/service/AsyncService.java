package com.testasynchronous.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    //告诉Spring这是一个异步的方法,同时要在主方法上开启异步方法
//    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("数据正在处理、、、、");
    }
}

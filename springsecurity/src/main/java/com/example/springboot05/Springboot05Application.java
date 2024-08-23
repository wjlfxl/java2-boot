package com.example.springboot05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.springboot05.mapper")   //扫描mapper包和@mapper二选一
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})  // 排除security安全验证
public class Springboot05Application {
    public static void main(String[] args) {
        SpringApplication.run(Springboot05Application.class, args);
    }

}

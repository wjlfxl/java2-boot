package com.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisplus.mapper.UserMapper;
import com.mybatisplus.pojo.User;
import com.mysql.cj.QueryResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class wrapperTest {

    @Autowired
    private UserMapper userMapper;

    //wrapper是条件构造器,多重条件查询
    @Test
    public void TestPageQuery(){
        //wrapper是条件构造器,多重条件
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //年龄大于20，年龄，更新时间非空
        //非空
        wrapper.isNotNull("age");
        wrapper.isNotNull("update_time");
        //大于
        wrapper.ge("age",20);

        System.out.println(userMapper.selectList(wrapper));
    }

//    查询一个
    @Test
    public void TestPageQuery2(){
        //wrapper是条件构造器,多重条件
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //名字==诸葛
        wrapper.eq("name","诸葛");
        //selectOne只能查一个存在的
        User user=userMapper.selectOne(wrapper);
        System.out.println(user);
    }

    //    查询一个
    @Test
    public void TestPageQuery3(){
        //wrapper是条件构造器,多重条件
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //年龄18到30之间的
        wrapper.between("age",18,30);

        Long count = userMapper.selectCount(wrapper);
        System.out.println(count);
//        List<User> users = userMapper.selectList(wrapper);
//        users.forEach(System.out::println);
    }

    //    Map查询
    @Test
    public void TestPageQuery4(){
        //wrapper是条件构造器,多重条件
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //不包含
//        wrapper.notLike("name","w");
        //包含
        wrapper.like("name","w");
        //右开头，比如 w%
        wrapper.likeRight("name","l");

        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);
    }
}

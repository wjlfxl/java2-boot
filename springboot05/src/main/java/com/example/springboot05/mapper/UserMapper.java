package com.example.springboot05.mapper;

import com.example.springboot05.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository  //表示这是dao层，只有需要用到mybatis时才用到
public interface UserMapper {

    User userByNP(String name,Integer passwd);
}

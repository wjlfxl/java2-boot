package com.shiro2.mapper;

import com.shiro2.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository  //表示这是dao层，只有需要用到mybatis时才用到
public interface UserMapper {

    List<User> queryUserList();

    User userByName(String name);

    User userByNP(String name,Integer passwd);

}

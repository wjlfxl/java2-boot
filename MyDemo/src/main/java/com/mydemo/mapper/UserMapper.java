package com.mydemo.mapper;

import com.mydemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository  //表示这是dao层，只有需要用到mybatis时才用到
public interface UserMapper {

    List<User> queryUserList();

    User userById(Integer id);
    User userByIdName(String value);

    int addUser(User user);

    int deleteUser(Integer id);

    int upDateUser(User user);

    List<User> queryUserListHelp(int page);


//    User userByName(String name);


}

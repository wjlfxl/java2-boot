package com.mydemo.mapper;

import com.mydemo.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository  //表示这是dao层，只有需要用到mybatis时才用到
public interface AdminMapper {

    Admin adminByNP(String name, Integer password);

    Admin adminByName(String name);

    int upDateAdmin(Admin admin);

    int deleteAdmin(String name);

}

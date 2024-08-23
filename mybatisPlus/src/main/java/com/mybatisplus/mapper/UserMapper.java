package com.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisplus.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository  //表示这是dao(持久层)层，只有需要用到mybatis（数据库）时才用到
public interface UserMapper extends BaseMapper<User> {
//所有的CRUD操作都已经编写完成了,你不需要像以前的配置一大堆文件了!
}

package com.mydemo.mapper;

import com.mydemo.pojo.Supply;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository  //表示这是dao层，只有需要用到mybatis时才用到
public interface SupplyMapper {

    List<Supply> querySupplyList();

}

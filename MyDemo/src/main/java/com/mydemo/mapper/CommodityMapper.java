package com.mydemo.mapper;

import com.mydemo.pojo.Commodity;
import com.mydemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository  //表示这是dao层，只有需要用到mybatis时才用到
public interface CommodityMapper {

    List<Commodity> queryCommodityList();

    Commodity commodityById(Integer id);

    int addCommodity(Commodity commodity);

    int deleteCommodity(Integer id);

    int upDateCommodity(Commodity commodity);

}

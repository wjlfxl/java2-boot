package com.mydemo.mapper;

import com.mydemo.pojo.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository  //表示这是dao层，只有需要用到mybatis时才用到
public interface StockMapper {

    List<Stock> queryStockList();
    Stock stockById(Integer id);

    int addStock(Stock stock);

    int deleteStock(Integer id);

    int upDateStock(Stock stock);
}

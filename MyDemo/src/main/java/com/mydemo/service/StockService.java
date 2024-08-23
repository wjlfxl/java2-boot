package com.mydemo.service;

import com.mydemo.pojo.Stock;
import java.util.List;

public interface StockService {
    List<Stock> queryStockList();

    Stock stockById(Integer id);

    int addStock(Stock stock);

    int deleteStock(Integer id);

    int upDateStock(Stock stock);
}

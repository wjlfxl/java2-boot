package com.mydemo.service.impl;

import com.mydemo.mapper.StockMapper;
import com.mydemo.pojo.Stock;
import com.mydemo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StockService")
public class StockServiceImpl implements StockService {
    @Autowired
    private StockMapper stockMapper;

    @Override
    public List<Stock> queryStockList() {
        return stockMapper.queryStockList();
    }

    @Override
    public Stock stockById(Integer id) {
        return stockMapper.stockById(id);
    }

    @Override
    public int addStock(Stock stock) {
        return stockMapper.addStock(stock);
    }

    @Override
    public int deleteStock(Integer id) {
        return stockMapper.deleteStock(id);
    }

    @Override
    public int upDateStock(Stock stock) {
        return stockMapper.upDateStock(stock);
    }
}

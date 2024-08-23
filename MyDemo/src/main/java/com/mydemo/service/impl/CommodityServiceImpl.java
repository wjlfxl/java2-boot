package com.mydemo.service.impl;

import com.mydemo.mapper.CommodityMapper;
import com.mydemo.pojo.Commodity;
import com.mydemo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CommodityService")
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public List<Commodity> queryCommodityList() {
        return commodityMapper.queryCommodityList();
    }

    @Override
    public Commodity commodityById(Integer id) {
        return commodityMapper.commodityById(id);
    }

    @Override
    public int addCommodity(Commodity commodity) {
        return commodityMapper.addCommodity(commodity);
    }

    @Override
    public int deleteCommodity(Integer id) {
        return commodityMapper.deleteCommodity(id);
    }

    @Override
    public int upDateCommodity(Commodity commodity) {
        return commodityMapper.upDateCommodity(commodity);
    }

}

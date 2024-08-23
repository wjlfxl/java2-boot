package com.mydemo.service.impl;

import com.mydemo.mapper.SupplyMapper;
import com.mydemo.pojo.Supply;
import com.mydemo.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SupplyService")
public class SupplyServiceImpl implements SupplyService {
    @Autowired
    private SupplyMapper supplyMapper;


    @Override
    public List<Supply> querySupplyList() {
        return supplyMapper.querySupplyList();
    }
}

package com.mydemo.service.impl;

import com.mydemo.mapper.MerchantMapper;
import com.mydemo.pojo.Merchant;
import com.mydemo.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MerchantService")
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    private MerchantMapper merchantMapper;


    @Override
    public List<Merchant> queryMerchantList() {
        return merchantMapper.queryMerchantList();
    }

    @Override
    public Merchant merchantById(Integer id) {
        return merchantMapper.merchantById(id);
    }

    @Override
    public int addMerchant(Merchant merchant) {
        return merchantMapper.addMerchant(merchant);
    }

    @Override
    public int deleteMerchant(Integer id) {
        return merchantMapper.deleteMerchant(id);
    }

    @Override
    public int upDateMerchant(Merchant merchant) {
        return merchantMapper.upDateMerchant(merchant);
    }
}

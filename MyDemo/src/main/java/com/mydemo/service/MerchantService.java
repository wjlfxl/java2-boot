package com.mydemo.service;

import com.mydemo.pojo.Merchant;

import java.util.List;

public interface MerchantService {
    List<Merchant> queryMerchantList();

    Merchant merchantById(Integer id);

    int addMerchant(Merchant merchant);

    int deleteMerchant(Integer id);

    int upDateMerchant(Merchant merchant);
}

package com.mydemo.mapper;

import com.mydemo.pojo.Merchant;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository  //表示这是dao层，只有需要用到mybatis时才用到
public interface MerchantMapper {

    List<Merchant> queryMerchantList();

    Merchant merchantById(Integer id);

    int addMerchant(Merchant merchant);

    int deleteMerchant(Integer id);

    int upDateMerchant(Merchant merchant);
}

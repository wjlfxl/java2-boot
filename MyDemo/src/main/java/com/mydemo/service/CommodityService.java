package com.mydemo.service;

import com.mydemo.pojo.Commodity;
import java.util.List;

public interface CommodityService {
    List<Commodity> queryCommodityList();

    Commodity commodityById(Integer id);

    int addCommodity(Commodity commodity);

    int deleteCommodity(Integer id);

    int upDateCommodity(Commodity commodity);

}

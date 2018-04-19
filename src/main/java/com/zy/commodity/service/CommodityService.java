package com.zy.commodity.service;

import com.zy.commodity.model.EpCommodityinfo;
import com.zy.commodity.model.EpCommoditytype;
import com.zy.commodity.model.EpCommodityunit;
import org.springframework.stereotype.Service;

/**
 * Created by xxz on 2018/4/19 0019
 */
@Service
public interface CommodityService {
    int saveCommodityinfo(EpCommodityinfo epCommodityinfo);

    int saveCommoditytype(EpCommoditytype epCommoditytype);

    int saveCommodityunit(EpCommodityunit epCommodityunit);
}

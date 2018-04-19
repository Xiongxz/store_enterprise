package com.zy.commodity.service;


import com.zy.commodity.mapper.EpCommodityinfoMapper;
import com.zy.commodity.mapper.EpCommoditytypeMapper;
import com.zy.commodity.mapper.EpCommodityunitMapper;
import com.zy.commodity.model.EpCommodityinfo;
import com.zy.commodity.model.EpCommoditytype;
import com.zy.commodity.model.EpCommodityunit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xxz on 2018/4/19 0019
 */
@Service
public class CommodityImpl implements CommodityService {

    @Autowired
    private EpCommodityinfoMapper epCommodityinfoMapper;

    @Autowired
    private EpCommoditytypeMapper epCommoditytypeMapper;

    @Autowired
    private EpCommodityunitMapper epCommodityunitMapper;

    @Override
    public int saveCommodityinfo(EpCommodityinfo epCommodityinfo) {
        return epCommodityinfoMapper.insert(epCommodityinfo);
    }

    @Override
    public int saveCommoditytype(EpCommoditytype epCommoditytype) {
        return epCommoditytypeMapper.insert(epCommoditytype);
    }

    @Override
    public int saveCommodityunit(EpCommodityunit epCommodityunit) {
        return epCommodityunitMapper.insert(epCommodityunit);
    }
}

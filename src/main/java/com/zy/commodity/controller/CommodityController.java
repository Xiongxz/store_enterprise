package com.zy.commodity.controller;

import com.zy.commodity.model.EpCommodityinfo;
import com.zy.commodity.model.EpCommoditytype;
import com.zy.commodity.model.EpCommodityunit;
import com.zy.commodity.service.CommodityService;
import com.zy.utils.CustomIDGenerator;
import com.zy.utils.ZYJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by xxz on 2018/4/19 0019
 * 关于企业商品
 */
@RestController
public class CommodityController {

    @Autowired
    private CommodityService commodityService;
    /**
     * 测试数据
     *
     */
    @RequestMapping(value = "/saveData")
    public ZYJSONResult TestDate(){
        int typeId = 1;
        String typeName = "饮料";
        int unitId = 1;
        String unitName = "瓶";
        try {

        //商品类别
        EpCommoditytype type = new EpCommoditytype();
        type.setCommoditytypeId(typeId);
        type.setCommoditytypeName(typeName);
        int typeData = commodityService.saveCommoditytype(type);
        //商品单位
        EpCommodityunit unit = new EpCommodityunit();
        unit.setUnitId(unitId);
        unit.setUnitName(unitName);
        int unitData = commodityService.saveCommodityunit(unit);
        //商品
        EpCommodityinfo info = new EpCommodityinfo();
        info.setCommodityId(Integer.valueOf(CustomIDGenerator.getNextID("1", "6", 1)));
        info.setCommodityName("农夫山泉-矿泉水");
        info.setBuyingPrice(new BigDecimal(1.50));
        info.setSellingPrice(new BigDecimal(2.00));
        info.setCommodityStock(100);
        info.setCommoditytypeId(typeId);
        info.setCommoditytypeName(typeName);
        info.setUnitId(unitId);
        info.setUnitName(unitName);
        info.setCommodityImgurl("cimg/11111.png");
        info.setAutonomySign(0);
        info.setCommodityState(1);
        int infoData = commodityService.saveCommodityinfo(info);
        if (typeData==1&&unitData==1&&infoData==1){
            System.out.println("添加成功");
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ZYJSONResult.ok("添加成功");
    }
}

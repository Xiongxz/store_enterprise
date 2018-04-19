package com.zy.commodity.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ep_commoditytype")
public class EpCommoditytype {
    /**
     * 商品类别ID
     */
    @Id
    @Column(name = "commoditytype_id")
    private Integer commoditytypeId;

    /**
     * 商品类别名称
     */
    @Column(name = "commoditytype_name")
    private String commoditytypeName;

    /**
     * 获取商品类别ID
     *
     * @return commoditytype_id - 商品类别ID
     */
    public Integer getCommoditytypeId() {
        return commoditytypeId;
    }

    /**
     * 设置商品类别ID
     *
     * @param commoditytypeId 商品类别ID
     */
    public void setCommoditytypeId(Integer commoditytypeId) {
        this.commoditytypeId = commoditytypeId;
    }

    /**
     * 获取商品类别名称
     *
     * @return commoditytype_name - 商品类别名称
     */
    public String getCommoditytypeName() {
        return commoditytypeName;
    }

    /**
     * 设置商品类别名称
     *
     * @param commoditytypeName 商品类别名称
     */
    public void setCommoditytypeName(String commoditytypeName) {
        this.commoditytypeName = commoditytypeName;
    }
}
package com.zy.commodity.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ep_commodityunit")
public class EpCommodityunit {
    /**
     * 商品单位ID
     */
    @Id
    @Column(name = "unit_id")
    private Integer unitId;

    /**
     * 商品单位名称
     */
    @Column(name = "unit_name")
    private String unitName;

    /**
     * 获取商品单位ID
     *
     * @return unit_id - 商品单位ID
     */
    public Integer getUnitId() {
        return unitId;
    }

    /**
     * 设置商品单位ID
     *
     * @param unitId 商品单位ID
     */
    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    /**
     * 获取商品单位名称
     *
     * @return unit_name - 商品单位名称
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 设置商品单位名称
     *
     * @param unitName 商品单位名称
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
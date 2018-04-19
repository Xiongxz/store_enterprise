package com.zy.commodity.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "ep_commodityinfo")
public class EpCommodityinfo {
    /**
     * 商品ID（编号）
     */
    @Id
    @Column(name = "commodity_id")
    private Integer commodityId;

    /**
     * 企业ID
     */
    @Column(name = "enterprise_id")
    private String enterpriseId;

    /**
     * 商品名称
     */
    @Column(name = "commodity_name")
    private String commodityName;

    /**
     * 商品进货价
     */
    @Column(name = "buying_price")
    private BigDecimal buyingPrice;

    /**
     * 商品卖价
     */
    @Column(name = "selling_price")
    private BigDecimal sellingPrice;

    /**
     * 商品库存
     */
    @Column(name = "commodity_stock")
    private Integer commodityStock;

    /**
     * 商品类别ID
     */
    @Column(name = "commoditytype_id")
    private Integer commoditytypeId;

    /**
     * 商品类别名称
     */
    @Column(name = "commoditytype_name")
    private String commoditytypeName;

    /**
     * 商品单位ID
     */
    @Column(name = "unit_id")
    private Integer unitId;

    /**
     * 商品单位名称
     */
    @Column(name = "unit_name")
    private String unitName;

    /**
     * 商品图片地址
     */
    @Column(name = "commodity_imgurl")
    private String commodityImgurl;

    /**
     * 自主商品标志（0平台1自主）
     */
    @Column(name = "autonomy_sign")
    private Integer autonomySign;

    /**
     * 商品状态0未上架1已上架
     */
    @Column(name = "commodity_state")
    private Integer commodityState;

    /**
     * 获取商品ID（编号）
     *
     * @return commodity_id - 商品ID（编号）
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品ID（编号）
     *
     * @param commodityId 商品ID（编号）
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取企业ID
     *
     * @return enterprise_id - 企业ID
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * 设置企业ID
     *
     * @param enterpriseId 企业ID
     */
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * 获取商品名称
     *
     * @return commodity_name - 商品名称
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品名称
     *
     * @param commodityName 商品名称
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    /**
     * 获取商品进货价
     *
     * @return buying_price - 商品进货价
     */
    public BigDecimal getBuyingPrice() {
        return buyingPrice;
    }

    /**
     * 设置商品进货价
     *
     * @param buyingPrice 商品进货价
     */
    public void setBuyingPrice(BigDecimal buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    /**
     * 获取商品卖价
     *
     * @return selling_price - 商品卖价
     */
    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    /**
     * 设置商品卖价
     *
     * @param sellingPrice 商品卖价
     */
    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     * 获取商品库存
     *
     * @return commodity_stock - 商品库存
     */
    public Integer getCommodityStock() {
        return commodityStock;
    }

    /**
     * 设置商品库存
     *
     * @param commodityStock 商品库存
     */
    public void setCommodityStock(Integer commodityStock) {
        this.commodityStock = commodityStock;
    }

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

    /**
     * 获取商品图片地址
     *
     * @return commodity_imgurl - 商品图片地址
     */
    public String getCommodityImgurl() {
        return commodityImgurl;
    }

    /**
     * 设置商品图片地址
     *
     * @param commodityImgurl 商品图片地址
     */
    public void setCommodityImgurl(String commodityImgurl) {
        this.commodityImgurl = commodityImgurl;
    }

    /**
     * 获取自主商品标志（0平台1自主）
     *
     * @return autonomy_sign - 自主商品标志（0平台1自主）
     */
    public Integer getAutonomySign() {
        return autonomySign;
    }

    /**
     * 设置自主商品标志（0平台1自主）
     *
     * @param autonomySign 自主商品标志（0平台1自主）
     */
    public void setAutonomySign(Integer autonomySign) {
        this.autonomySign = autonomySign;
    }

    /**
     * 获取商品状态0未上架1已上架
     *
     * @return commodity_state - 商品状态0未上架1已上架
     */
    public Integer getCommodityState() {
        return commodityState;
    }

    /**
     * 设置商品状态0未上架1已上架
     *
     * @param commodityState 商品状态0未上架1已上架
     */
    public void setCommodityState(Integer commodityState) {
        this.commodityState = commodityState;
    }
}
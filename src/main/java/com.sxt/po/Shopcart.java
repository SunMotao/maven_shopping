package com.sxt.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by 57056 on 2018/1/15.
 */
public class Shopcart implements Serializable{
    private Integer productId;
    private Integer productNumber;
    private Timestamp shopcartCreateTime;
    private Timestamp shopcartModifiedTime;

    public Shopcart() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Timestamp getShopcartCreateTime() {
        return shopcartCreateTime;
    }

    public void setShopcartCreateTime(Timestamp shopcartCreateTime) {
        this.shopcartCreateTime = shopcartCreateTime;
    }

    public Timestamp getShopcartModifiedTime() {
        return shopcartModifiedTime;
    }

    public void setShopcartModifiedTime(Timestamp shopcartModifiedTime) {
        this.shopcartModifiedTime = shopcartModifiedTime;
    }

    @Override
    public String toString() {
        return "Shopcart{" +
                "productId=" + productId +
                ", productNumber=" + productNumber +
                ", shopcartCreateTime=" + shopcartCreateTime +
                ", shopcartModifiedTime=" + shopcartModifiedTime +
                '}';
    }
}

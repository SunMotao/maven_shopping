package com.sxt.po;

import java.sql.Timestamp;

/**
 * Created by 57056 on 2018/1/15.
 */
public class OuterStock extends BaseEntity<Integer> {
    private Integer productId;
    private Integer outerStockNumber;
    private Timestamp outerCreateTime;
    private Timestamp outerModifiedTime;

    public OuterStock() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOuterStockNumber() {
        return outerStockNumber;
    }

    public void setOuterStockNumber(Integer outerStockNumber) {
        this.outerStockNumber = outerStockNumber;
    }

    public Timestamp getOuterCreateTime() {
        return outerCreateTime;
    }

    public void setOuterCreateTime(Timestamp outerCreateTime) {
        this.outerCreateTime = outerCreateTime;
    }

    public Timestamp getOuterModifiedTime() {
        return outerModifiedTime;
    }

    public void setOuterModifiedTime(Timestamp outerModifiedTime) {
        this.outerModifiedTime = outerModifiedTime;
    }

    @Override
    public String toString() {
        return "OuterStock{" +
                "productId=" + productId +
                ", outerStockNumber=" + outerStockNumber +
                ", outerCreateTime=" + outerCreateTime +
                ", outerModifiedTime=" + outerModifiedTime +
                '}';
    }
}

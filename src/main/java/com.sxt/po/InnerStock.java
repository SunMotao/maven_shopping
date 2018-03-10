package com.sxt.po;

import java.sql.Timestamp;

/**
 * Created by 57056 on 2018/1/15.
 */
public class InnerStock extends BaseEntity<Integer> {
    private Integer productId;
    private Integer innerStockNumber;
    private Timestamp innerCreateTime;
    private Timestamp innerModifiedTime;

    public InnerStock() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getInnerStockNumber() {
        return innerStockNumber;
    }

    public void setInnerStockNumber(Integer innerStockNumber) {
        this.innerStockNumber = innerStockNumber;
    }

    public Timestamp getInnerCreateTime() {
        return innerCreateTime;
    }

    public void setInnerCreateTime(Timestamp innerCreateTime) {
        this.innerCreateTime = innerCreateTime;
    }

    public Timestamp getInnerModifiedTime() {
        return innerModifiedTime;
    }

    public void setInnerModifiedTime(Timestamp innerModifiedTime) {
        this.innerModifiedTime = innerModifiedTime;
    }

    @Override
    public String toString() {
        return "InnerStockService{" +
                "productId=" + productId +
                ", innerStockNumber=" + innerStockNumber +
                ", innerCreateTime=" + innerCreateTime +
                ", innerModifiedTime=" + innerModifiedTime +
                '}';
    }
}

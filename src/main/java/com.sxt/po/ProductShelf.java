package com.sxt.po;

import java.sql.Timestamp;

/**
 * Created by 57056 on 2018/1/15.
 */
public class ProductShelf extends BaseEntity<Integer> {
    public static final Integer PRODUCT_IS_SHELF = 1;
    public static final Integer PRODUCT_IS_NOT_SHELF = 0;

    private Integer productId;
    private Integer productShelfState;
    private Timestamp shelfCreateTime;
    private Timestamp shelfModifiedTime;

    public ProductShelf() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductShelfState() {
        return productShelfState;
    }

    public void setProductShelfState(Integer productShelfState) {
        this.productShelfState = productShelfState;
    }

    public Timestamp getShelfCreateTime() {
        return shelfCreateTime;
    }

    public void setShelfCreateTime(Timestamp shelfCreateTime) {
        this.shelfCreateTime = shelfCreateTime;
    }

    public Timestamp getShelfModifiedTime() {
        return shelfModifiedTime;
    }

    public void setShelfModifiedTime(Timestamp shelfModifiedTime) {
        this.shelfModifiedTime = shelfModifiedTime;
    }

    @Override
    public String toString() {
        return "ProductShelf{" +
                "productId=" + productId +
                ", productShelfState=" + productShelfState +
                ", shelfCreateTime=" + shelfCreateTime +
                ", shelfModifiedTime=" + shelfModifiedTime +
                '}';
    }
}

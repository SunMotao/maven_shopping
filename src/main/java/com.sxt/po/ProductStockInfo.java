package com.sxt.po;

import java.io.Serializable;

/**
 * Created by xiaohuang on 2018/1/31.
 */
public class ProductStockInfo implements Serializable {
    private Product product;
    private  Integer innerStockNumber;
    private  Integer outerStockNumber;
    private  Integer nowstockNumber;

    public ProductStockInfo() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getInnerStockNumber() {
        return innerStockNumber;
    }

    public void setInnerStockNumber(Integer innerStockNumber) {
        this.innerStockNumber = innerStockNumber;
    }

    public Integer getOuterStockNumber() {
        return outerStockNumber;
    }

    public void setOuterStockNumber(Integer outerStockNumber) {
        this.outerStockNumber = outerStockNumber;
    }

    public Integer getNowstockNumber() {
        return nowstockNumber;
    }

    public void setNowstockNumber(Integer nowstockNumber) {
        this.nowstockNumber = nowstockNumber;
    }

    @Override
    public String toString() {
        return "ProductStockInfo{" +
                "product=" + product +
                ", innerStockNumber=" + innerStockNumber +
                ", outerStockNumber=" + outerStockNumber +
                ", nowstockNumber=" + nowstockNumber +
                '}';
    }
}

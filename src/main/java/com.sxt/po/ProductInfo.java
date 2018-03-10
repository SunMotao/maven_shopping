package com.sxt.po;

/**
 * Created by 57056 on 2018/1/20.
 */
public class ProductInfo {
    private Integer id;
    private Integer productId;
    private String productCaption;
    private String smallImg;
    private String bigImg;

    public ProductInfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductCaption() {
        return productCaption;
    }

    public void setProductCaption(String productCaption) {
        this.productCaption = productCaption;
    }

    public String getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(String smallImg) {
        this.smallImg = smallImg;
    }

    public String getBigImg() {
        return bigImg;
    }

    public void setBigImg(String bigImg) {
        this.bigImg = bigImg;
    }

    @Override
    public String toString() {
        return "ProductInfoDao{" +
                "id=" + id +
                ", productId=" + productId +
                ", productCaption='" + productCaption + '\'' +
                ", smallImg='" + smallImg + '\'' +
                ", bigImg='" + bigImg + '\'' +
                '}';
    }
}

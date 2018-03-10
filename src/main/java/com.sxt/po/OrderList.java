package com.sxt.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by 57056 on 2018/1/15.
 */
public class OrderList implements Serializable{
    public static final Integer ORDER_IS_NOT_TRANSPORTED=0;
    public static final Integer ORDER_IS_TRANSPORTED=1;
    public static final Integer HAS_RECEIVED=2;
    public static final Integer ORDER_HAS_NOT_PAID=0;
    public static final Integer ORDER_HAS_PAID=1;
    public static final Integer ORDER_IS_NOT_DELETED=0;
    public static final Integer ORDER_IS_DELETED=1;

    private Integer id;
    private Integer customerId;
    private BigDecimal totalMoney;
    private Integer addressId;
    private Integer orderIsTransport;
    private Integer orderIsDelete;
    private Integer orderIsPay;
    private Timestamp orderCreateTime;
    private Timestamp orderModifiedTime;
    private List<OrderItem> orderItemList;

    public OrderList() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getOrderIsTransport() {
        return orderIsTransport;
    }

    public void setOrderIsTransport(Integer orderIsTransport) {
        this.orderIsTransport = orderIsTransport;
    }

    public Integer getOrderIsDelete() {
        return orderIsDelete;
    }

    public void setOrderIsDelete(Integer orderIsDelete) {
        this.orderIsDelete = orderIsDelete;
    }

    public Integer getOrderIsPay() {
        return orderIsPay;
    }

    public void setOrderIsPay(Integer orderIsPay) {
        this.orderIsPay = orderIsPay;
    }

    public Timestamp getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Timestamp orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Timestamp getOrderModifiedTime() {
        return orderModifiedTime;
    }

    public void setOrderModifiedTime(Timestamp orderModifiedTime) {
        this.orderModifiedTime = orderModifiedTime;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", totalMoney=" + totalMoney +
                ", addressId=" + addressId +
                ", orderIsTransport=" + orderIsTransport +
                ", orderIsDelete=" + orderIsDelete +
                ", orderIsPay=" + orderIsPay +
                ", orderCreateTime=" + orderCreateTime +
                ", orderModifiedTime=" + orderModifiedTime +
                ", orderItemList=" + orderItemList +
                '}';
    }
}

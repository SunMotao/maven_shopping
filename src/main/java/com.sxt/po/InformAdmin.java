package com.sxt.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by 57056 on 2018/1/26.
 */
public class InformAdmin implements Serializable{
    public  static final Integer INFORM_HAS_READED=1;
    public  static final Integer INFORM_HAS_NOT_READED=0;
    public  static final Integer INFORM_HAS_MARKED=2;
    public static final Integer INFORM_HAS_DELETED=3;

    private Integer id;
    private String informType;
    private String informTheme;
    private String informAbstract;
    private Integer productId;
    private Integer customerId;
    private Integer informStatus;
    private Timestamp informCreateTime;

    public InformAdmin() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInformType() {
        return informType;
    }

    public void setInformType(String informType) {
        this.informType = informType;
    }

    public String getInformTheme() {
        return informTheme;
    }

    public void setInformTheme(String informTheme) {
        this.informTheme = informTheme;
    }

    public String getInformAbstract() {
        return informAbstract;
    }

    public void setInformAbstract(String informAbstract) {
        this.informAbstract = informAbstract;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getInformStatus() {
        return informStatus;
    }

    public void setInformStatus(Integer informStatus) {
        this.informStatus = informStatus;
    }

    public Timestamp getInformCreateTime() {
        return informCreateTime;
    }

    public void setInformCreateTime(Timestamp informCreateTime) {
        this.informCreateTime = informCreateTime;
    }

    @Override
    public String toString() {
        return "InformAdmin{" +
                "id=" + id +
                ", informType='" + informType + '\'' +
                ", informTheme='" + informTheme + '\'' +
                ", informAbstract='" + informAbstract + '\'' +
                ", productId=" + productId +
                ", customerId=" + customerId +
                ", informStatus=" + informStatus +
                ", informCreateTime=" + informCreateTime +
                '}';
    }
}

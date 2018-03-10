package com.sxt.po;

import java.io.Serializable;
import java.security.Timestamp;

/**
 * Created by 57056 on 2018/1/15.
 */
public class Address implements Serializable {
    private Integer id;
    private Integer customerId;
    private String privance;
    private String city;
    private String country;
    private String town;
    private String road;
    private String addressLable;
    private Timestamp addressCreateTime;
    private Timestamp addressModifiedTime;

    public Address() {
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

    public String getPrivance() {
        return privance;
    }

    public void setPrivance(String privance) {
        this.privance = privance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getAddressLable() {
        return addressLable;
    }

    public void setAddressLable(String addressLable) {
        this.addressLable = addressLable;
    }

    public Timestamp getAddressCreateTime() {
        return addressCreateTime;
    }

    public void setAddressCreateTime(Timestamp addressCreateTime) {
        this.addressCreateTime = addressCreateTime;
    }

    public Timestamp getAddressModifiedTime() {
        return addressModifiedTime;
    }

    public void setAddressModifiedTime(Timestamp addressModifiedTime) {
        this.addressModifiedTime = addressModifiedTime;
    }

    @Override
    public String toString() {
        return "Address{" +
                "customerId=" + customerId +
                ", privance='" + privance + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", town='" + town + '\'' +
                ", road='" + road + '\'' +
                ", addressLable='" + addressLable + '\'' +
                ", addressCreateTime=" + addressCreateTime +
                ", addressModifiedTime=" + addressModifiedTime +
                '}';
    }
}

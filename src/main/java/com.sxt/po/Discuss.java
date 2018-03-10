package com.sxt.po;

import java.math.BigDecimal;
import java.security.Timestamp;

/**
 * Created by 57056 on 2018/1/15.
 */
public class Discuss extends BaseEntity<Integer> {
    public static final Integer DISCUSS_IS_NOT_DELETED=0;
    public static final Integer DISCUSS_IS_DELETED=1;
    private Integer customerId;
    private Integer itemId;
    private Integer productId;
    private BigDecimal discussScore;
    private Integer discussIsDelete;
    private Timestamp discussCreateTime;
    private Timestamp disscussModifiedTime;

    public Discuss() {
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BigDecimal getDiscussScore() {
        return discussScore;
    }

    public void setDiscussScore(BigDecimal discussScore) {
        this.discussScore = discussScore;
    }

    public Integer getDiscussIsDelete() {
        return discussIsDelete;
    }

    public void setDiscussIsDelete(Integer discussIsDelete) {
        this.discussIsDelete = discussIsDelete;
    }

    public Timestamp getDiscussCreateTime() {
        return discussCreateTime;
    }

    public void setDiscussCreateTime(Timestamp discussCreateTime) {
        this.discussCreateTime = discussCreateTime;
    }

    public Timestamp getDisscussModifiedTime() {
        return disscussModifiedTime;
    }

    public void setDisscussModifiedTime(Timestamp disscussModifiedTime) {
        this.disscussModifiedTime = disscussModifiedTime;
    }

    @Override
    public String toString() {
        return "Discuss{" +
                "customerId=" + customerId +
                ", itemId=" + itemId +
                ", productId=" + productId +
                ", discussScore=" + discussScore +
                ", discussIsDelete=" + discussIsDelete +
                ", discussCreateTime=" + discussCreateTime +
                ", disscussModifiedTime=" + disscussModifiedTime +
                '}';
    }
}

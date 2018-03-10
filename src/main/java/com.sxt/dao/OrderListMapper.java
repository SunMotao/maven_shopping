package com.sxt.dao;

import com.sxt.po.OrderList;

import java.util.List;

/**
 * Created by 57056 on 2018/3/3.
 */
public interface OrderListMapper {
    List<OrderList> queryOrderListByCid(int cid);
}

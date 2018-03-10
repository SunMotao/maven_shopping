package com.sxt.dao;

import com.sxt.po.ProductStock;

/**
 * Created by 57056 on 2018/3/1.
 */
public interface ProductStockMapper {
    ProductStock queryById(int id);
    ProductStock queryByPid(int pid);
}

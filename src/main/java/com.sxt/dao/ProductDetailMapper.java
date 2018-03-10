package com.sxt.dao;

import com.sxt.po.ProductDetail;

/**
 * Created by 57056 on 2018/3/1.
 */
public interface ProductDetailMapper {
//    ProductDetail queryById(int id);
    ProductDetail queryByPid(int pid);
}

package com.sxt.dao;

import com.sxt.po.ProductShelf;

/**
 * Created by 57056 on 2018/3/1.
 */
public interface ProductShelfMapper {
    ProductShelf queryById(int id);
    ProductShelf queryByPid(int pid);
}

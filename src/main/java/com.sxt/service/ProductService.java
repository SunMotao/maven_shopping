package com.sxt.service;

import com.sxt.po.Product;

import java.util.List;

/**
 * Created by 57056 on 2018/2/28.
 */
public interface ProductService {
    boolean addProduct(Product product);
    boolean deleteProduct(Product product);
    boolean updateProduct(Product product);
    List<Product> queryAllProduct();
    Product queryById(int pid);
}

package com.sxt.service.impl;

import com.sxt.dao.ProductDao;
import com.sxt.po.Product;
import com.sxt.service.ProductService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 57056 on 2018/2/28.
 */
@Service(value = "productService")
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao productDao;
    @Override
    public boolean addProduct(Product product) {

        return productDao.addProduct(product);
    }

    @Override
    public boolean deleteProduct(Product product) {
        return false;
    }

    @Override
    public boolean updateProduct(Product product) {
        return false;
    }

    @Override
    public List<Product> queryAllProduct() {
        return null;
    }

    @Override
    public Product queryById(int pid) {
        return null;
    }
}

package com.sxt.service.impl;

import com.sxt.dao.CustomerDao;
import com.sxt.po.Customer;
import com.sxt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 57056 on 2018/2/28.
 */
@Transactional
@Service(value="customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

//    public CustomerDao getCustomerDao() {
//        return customerDao;
//    }
//
//    public void setCustomerDao(CustomerDao customerDao) {
//        this.customerDao = customerDao;
//    }

    @Override
    public Customer queryCustomerByName(Customer customer) {
        if (customer == null) {
            return null;
        }
        return customerDao.queryCustomerByName(customer);
    }

    @Override
    public boolean addCustomer(Customer customer) {
        if (customer == null) {
            return false;
        }
            return customerDao.addCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(Customer customer) {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> queryAllCustomer() {
        return null;
    }

    @Override
    public Customer queryById(int id) {
        return null;
    }

    @Override
    public List<Customer> queryCustomerListsById(List<Customer> customerList) {
        return null;
    }
}

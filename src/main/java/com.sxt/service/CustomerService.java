package com.sxt.service;

import com.sxt.po.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 57056 on 2018/2/28.
 */
public interface CustomerService {
    Customer queryCustomerByName(Customer customer);
    boolean addCustomer(Customer customer);
    boolean deleteCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    List<Customer> queryAllCustomer();
    Customer queryById(int id);
    List<Customer> queryCustomerListsById(List<Customer> customerList);
}

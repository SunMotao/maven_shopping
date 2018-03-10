package com.sxt.test;

import com.sxt.dao.CustomerDao;
import com.sxt.po.Customer;
import com.sxt.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 57056 on 2018/3/7.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("bean1.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");

        Customer customer =new Customer();
        Customer b = customerService.queryCustomerByName(customer);
        System.out.println(b);
    }
}

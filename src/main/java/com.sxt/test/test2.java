package com.sxt.test;

import com.sxt.dao.CustomerDao;
import com.sxt.po.Customer;
import com.sxt.service.CustomerService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 57056 on 2018/3/7.
 */
public class test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean1.xml");
//        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CustomerDao mapper = sqlSession.getMapper(CustomerDao.class);

        Customer customer =new Customer();
        customer.setCustomerName("sxt");
        customer.setCustomerPassword("123456");

        Customer customer1 = mapper.queryCustomerByName(customer);

//        Customer customer1 = customerService.queryCustomerByName(customer);
        System.out.println(customer1);
    }
}

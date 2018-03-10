package com.sxt.controller;

import com.sxt.po.Customer;
import com.sxt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 57056 on 2018/3/9.
 */
@Controller
public class IndexController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="")
    public String index(){
//        if (true) {
//            throw new NullPointerException();
//        }
        return "redirect:customerIndex.do";
    }

    @RequestMapping(value="/customerIndex.do")
    public String customerIndex(Customer customer, Model model, HttpServletRequest request, HttpSession session) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return "redirect:/customer/login.view";
        }
        String customerName = null;
        String customerPassword = null;
        for (Cookie cookie : cookies) {
            if ("customerName".equals(cookie.getName())) {
                customerName = cookie.getValue();
            }
            if ("customerPassword".equals(cookie.getName())) {
                customerPassword = cookie.getValue();
            }
        }
        customer.setCustomerName(customerName);
        customer.setCustomerPassword(customerPassword);
        customer = customerService.queryCustomerByName(customer);
        if (customer == null) {
//            model.addAttribute("info", "登录失败");
            return "redirect:/customer/login.view";
        }
        model.addAttribute("customer",customer);
        return "/customer/success";
    }
//    @RequestMapping(value="/adminIndex.view")
//    public String customerIndex(){
//
//    }
}

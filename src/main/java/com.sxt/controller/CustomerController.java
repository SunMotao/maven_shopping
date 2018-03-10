package com.sxt.controller;

import com.sxt.po.Customer;
import com.sxt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by 57056 on 2018/3/9.
 */
@Controller
@RequestMapping(value = "customer")
public class CustomerController {
    @Autowired

    private CustomerService customerService;

    @RequestMapping(value="/reg.view")
    public String regPage(){
        return "customer/register";
    }

    @RequestMapping(value="/reg.do")
    public String customerRegister(@ModelAttribute Customer customer, HttpSession httpSession, Model model){
//        System.out.println("之前"+customer);
        boolean b = customerService.addCustomer(customer);
//        System.out.println("之后"+customer);
        if(b){
            httpSession.setAttribute("customer",customer);
            model.addAttribute("info","注册成功");
            return "admin/adminLogin";
        }else{
            model.addAttribute("info","注册失败");
            return "customer/index";
        }
    }
@RequestMapping(value="/login.do")
    public String loginPage(){
    return "admin/adminLogin";
    }

@RequestMapping(value="/login.view")
    public String customerLogin(Customer customer, Model model, HttpSession session,
                                @RequestParam(value="isRemember",required = false) String isRemember,
                                HttpServletResponse response){
        customer = customerService.queryCustomerByName(customer);
        if (customer == null) {
            model.addAttribute("info","登录失败");
            return "customer/index";
        }
        //保存cookie
        if ("on".equals(isRemember)) {
            Cookie cookieName=new Cookie("customerName",customer.getCustomerName());
            cookieName.setMaxAge(60*60*24*7);
            cookieName.setPath("/");
            Cookie cookiePassword=new Cookie("customerPassword",customer.getCustomerPassword());
            cookiePassword.setMaxAge(60*60*24);
            cookiePassword.setPath("/");
            response.addCookie(cookieName);
            response.addCookie(cookiePassword);
        }
        session.setAttribute("customer",customer);
        model.addAttribute("info","登录成功");
        return "customer/success";

    }


}

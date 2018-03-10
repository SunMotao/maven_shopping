package com.sxt.controller;

import com.sxt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 57056 on 2018/3/8.
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController1 {
    @Autowired
    private CustomerService customerService;

//    @RequestMapping(value = "/registerCustomer")
//    public String registerCustomer(@ModelAttribute Customer customer,Map<String,Object> map){
//        map.put("customer",customer);
//        return "success";
//    }

//    @RequestMapping(value = "/registerCustomer")
//    public String registerCustomer(@ModelAttribute Customer customer, Model model){
//        model.addAttribute("customer",customer);
//        return "success";
//    }

//    @RequestMapping(value = "/registerCustomer")
//    public String registerCustomer(@ModelAttribute Customer customer, ModelMap model){
//        model.addAttribute("customer",customer);
//        return "success";
//    }

//    @RequestMapping(value = "/registerCustomer")
//    public String registerCustomer(@ModelAttribute Customer customer, ModelAndView modelAndView){
//        modelAndView.addObject("customer",customer);
//        return "success";
//    }

//    @RequestMapping(value = "/registerCustomer")
//    public String registerCustomer(@ModelAttribute Customer customer, HttpSession httpSession){
//        httpSession.setAttribute("customer",customer);
//        return "success";
//    }

    @RequestMapping(value = "/registerCustomer")
    public String registerCustomer(HttpServletRequest request){
        String customerName = request.getParameter("customerName");
        request.setAttribute("info",customerName);

        return "success";
    }

    @RequestMapping(value="/loginCustomer")
    public String loginCustomer(){
        return "admin/adminLogin";
    }

}

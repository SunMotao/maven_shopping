package com.sxt.controller;

import com.sxt.po.Admin;
import com.sxt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by 57056 on 2018/3/9.
 */
@Controller
@RequestMapping(value="admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value="/adminLogin.do")
    public String loginDo(){
        return "/admin/adminLogin";
    }

    @RequestMapping(value="/adminLogin.view")
    public String adminLogin(Admin admin, Model model, HttpSession session){
        admin = adminService.queryAdminByName(admin);
        if (admin == null) {
            model.addAttribute("info","登录失败");
            return "admin/adminLogin";
        }
        session.setAttribute("admin",admin);
        model.addAttribute("info","登录成功");
        return "admin/adminTop";
    }

}

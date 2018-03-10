package com.sxt.controller;

import com.sxt.po.Product;
import com.sxt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 57056 on 2018/3/8.
 */
@Controller
@RequestMapping(value="/product")
public class ProductComtroller {
    @Autowired
    private ProductService produceService;

    @RequestMapping(value="/operProduct/{id}/{oper}")
    public String updateProduct(@PathVariable(value="id") Integer id,@PathVariable(value = "oper") String oper){
        System.out.println(id);
        System.out.println(oper);
        return "success";
    }
    @RequestMapping(value="/addProduct.do")
    public String addProductDo(){
        return "/product/addProduct";
    }

    @RequestMapping(value="/addProduct.view")
    public String addProduct(@ModelAttribute Product product,Model model){

        boolean b = produceService.addProduct(product);

        if (b) {
            model.addAttribute("info","添加成功");
            return "/product/addProduct";
        }
        model.addAttribute("info","添加失败");
        return "/product/addProduct";
    }
}

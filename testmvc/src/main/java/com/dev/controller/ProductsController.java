package com.dev.controller;

import com.dev.entry.Products;
import com.dev.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    ProductsService productsService;
    @RequestMapping(value = "/add")
    @ResponseBody
    private String addProducts(@RequestBody Products products){
        productsService.addProducts(products);
        return "add success";
    }
    @PostMapping("/getProducts")
    @ResponseBody
    private List<Products> getProducts(){
       return productsService.getAllProducts();
    }

    @ResponseBody
    @RequestMapping("/getProductsByID")
    private Products getProductsByID(@RequestParam(name = "id",required = true) String id){
        //转为map
        //@RequestBody Map<String,String> map
        //return productsService.getProductsById(map.get("id"));
        //url传参,form提交
        //HttpServletRequest req
//        System.out.println(req.getParameter("id"));
//        return productsService.getProductsById(req.getParameter("id"));
        //
        return productsService.getProductsById(id);
    }


    @RequestMapping("/getByID/{id}")
    @ResponseBody
    private  Products getProductsByUUID(@PathVariable(name = "id",required = true) String id){
        return productsService.getProductsById(id);
    }
}

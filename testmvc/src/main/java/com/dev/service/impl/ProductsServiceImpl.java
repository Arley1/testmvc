package com.dev.service.impl;

import com.dev.entry.Products;
import com.dev.mapper.ProductsMapper;
import com.dev.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    ProductsMapper productsMapper;
    @Override
    public void addProducts(Products products) {
        productsMapper.addProducts(products);
    }

    @Override
    public List<Products> getAllProducts() {
        return productsMapper.queryAll();
    }

    @Override
    public Products getProductsById(String id) {
        return productsMapper.queryById(id);
    }
}

package com.dev.service;

import com.dev.entry.Products;

import java.util.List;


public interface ProductsService {
    void addProducts(Products products);
    List<Products> getAllProducts();
    Products getProductsById(String id);
}

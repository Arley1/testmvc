package com.dev.mapper;


import com.dev.entry.Products;

import java.util.List;

public interface ProductsMapper {
    void addProducts(Products products);
    List<Products> queryAll();
    Products queryById(String id);
}

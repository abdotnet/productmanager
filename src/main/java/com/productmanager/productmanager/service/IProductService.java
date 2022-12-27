package com.productmanager.productmanager.service;

import com.productmanager.productmanager.entity.Product;

import java.util.List;

public interface IProductService {

    List<Product> SearchProduct(String query);
    Product createProduct(Product product);
}

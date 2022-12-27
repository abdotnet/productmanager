package com.productmanager.productmanager.service.impl;

import com.productmanager.productmanager.entity.Product;
import com.productmanager.productmanager.repository.ProductRepository;
import com.productmanager.productmanager.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> SearchProduct(String query) {

      List<Product> products =   productRepository.SearchProduct(query);

        return products;
    }

    @Override
    public Product createProduct(Product product) {
       productRepository.save(product);
       return  product;
    }
}

package com.productmanager.productmanager.controller;

import com.productmanager.productmanager.entity.Product;
import com.productmanager.productmanager.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {

    private IProductService iProductService;

    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;
    }


    @GetMapping("search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("search") String search){

     return   ResponseEntity.ok( iProductService.SearchProduct(search));
    }

    @PostMapping("create")
    public ResponseEntity<Product> createProducts(@RequestBody Product product){

        return   ResponseEntity.ok( iProductService.createProduct(product));
    }
}

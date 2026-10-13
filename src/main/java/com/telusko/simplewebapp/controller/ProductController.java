package com.telusko.simplewebapp.controller;

import com.telusko.simplewebapp.model.Product;
import com.telusko.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@org.springframework.web.bind.annotation.PathVariable int id) {
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@org.springframework.web.bind.annotation.RequestBody Product product) {
        service.addProduct(product);
    }
}

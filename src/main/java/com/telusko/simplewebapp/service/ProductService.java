package com.telusko.simplewebapp.service;

import com.telusko.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 2000),
            new Product(103, "Shure Mic", 5000)
    );

    public List<Product> getProducts() {
        return products;
    }
}

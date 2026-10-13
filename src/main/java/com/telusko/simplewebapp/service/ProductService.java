package com.telusko.simplewebapp.service;

import com.telusko.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(List.of(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 2000),
            new Product(103, "Shure Mic", 5000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream().filter(product -> product.getProductId() == id).findFirst().orElse(null);
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}

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

    public void updateProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == product.getProductId()) {
                products.set(i, product);
                break;
            }
        }
    }

    public void deleteProduct(int prodId) {
        int idxToDelete = -1;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == prodId) {
                idxToDelete = i;
                break;
            }
        }
        products.remove(idxToDelete);
    }
}

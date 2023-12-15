
package com.example.shopping.service;

import com.example.shopping.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingCartService {

    private List<Product> productList = new ArrayList<>();

    // Constructor, methods to manage products (omitted for brevity)

    // Example method:
    public List<Product> getAllProducts() {
        // Logic to retrieve all products (can be from a database, etc.)
        return productList;
    }
}

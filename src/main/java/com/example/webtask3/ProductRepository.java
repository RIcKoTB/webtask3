package com.example.webtask3;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private static final List<Product> productList = new ArrayList<>();

    static {
        // Додайте початкові продукти
        productList.add(new Product(1, "Product 1", 10.99));
        productList.add(new Product(2, "Product 2", 19.99));
    }

    public static List<Product> getAllProducts() {
        return productList;
    }

    public static void addProduct(Product product) {
        productList.add(product);
    }
}


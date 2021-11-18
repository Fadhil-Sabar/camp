package com.enigma.vica.service;

import com.enigma.vica.model.Product;

public interface ProductService {
    public Product findProductById(Integer id);
    public void insertProduct(Product product);
    public void updateProduct(Integer stock, Integer id);
//    made by me
    public void insertProductUsingQuery(String name, Integer price, Integer stock, Integer rating);
    public void deleteProduct(Integer id);
}

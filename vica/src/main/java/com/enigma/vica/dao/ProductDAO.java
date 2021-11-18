package com.enigma.vica.dao;

import com.enigma.vica.model.Product;

public interface ProductDAO {
    public Product findProductById(Integer id);
    public void insertProduct(Product product);
    public void updateProduct(Integer stock, Integer id);
    public void insertProductUsingQuery(String name, Integer price, Integer stock, Integer rating);
    public void deleteProduct(Integer id);
}

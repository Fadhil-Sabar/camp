package com.enigma.vica.service;

import com.enigma.vica.dao.ProductDAO;
import com.enigma.vica.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductDAO productDAO;

    @Override
    public Product findProductById(Integer id) {
        return productDAO.findProductById(id);
    }

    @Override
    public void insertProduct(Product product) {
        productDAO.insertProduct(product);
    }

    @Override
    public void updateProduct(Integer stock, Integer id) {
        productDAO.updateProduct(stock, id);
    }

    @Override
    public void insertProductUsingQuery(String name, Integer price, Integer stock, Integer rating){
        productDAO.insertProductUsingQuery(name, price,stock,rating);
    }

    @Override
    public void deleteProduct(Integer id) {
        productDAO.deleteProduct(id);
    }
}

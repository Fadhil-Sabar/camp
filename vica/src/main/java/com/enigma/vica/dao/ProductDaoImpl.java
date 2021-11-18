package com.enigma.vica.dao;

import com.enigma.vica.mapper.ProductRowMapper;
import com.enigma.vica.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Product findProductById(Integer id) {
        String sql = "SELECT * FROM product WHERE product_id = ?";
        Product product = jdbcTemplate.queryForObject(sql, new ProductRowMapper(), id);

        return product;
    }

    @Override
    public void insertProduct(Product product) {
        String sql = "INSERT INTO product (name, price, stock, rating) VALUES (?, ?, ?, ?)";
        int product1 = jdbcTemplate.update(sql, product.getName(), product.getPrice(), product.getStock(), product.getRating());
    }

    @Override
    public void updateProduct(Integer stock, Integer id) {
        String sql = "UPDATE product SET stock = ? WHERE product_id = ?";
        jdbcTemplate.update(sql, stock, id);
    }

    @Override
    public void insertProductUsingQuery(String name, Integer price, Integer stock, Integer rating){
        String sql = "INSERT INTO product (name, price, stock, rating) VALUES (?, ?, ?, ?)";
        int product1 = jdbcTemplate.update(sql, name, price, stock, rating);
    }

    @Override
    public void deleteProduct(Integer id) {
        String sql = "DELETE FROM product WHERE product_id = ?";
        jdbcTemplate.update(sql, id);
    }

}

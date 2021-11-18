package com.enigma.vica.controller;

import com.enigma.vica.model.Product;
import com.enigma.vica.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable Integer id) {
        return productService.findProductById(id);
    }

    @PostMapping("/product")
    public void insertProduct(@RequestBody Product product) {
        productService.insertProduct(product);
    }

    @PostMapping("/query-product") // query-hello?var=
    public void insertProductUsingQP(@RequestParam String name, Integer price, Integer stock, Integer rating) {
        productService.insertProductUsingQuery(name, price, stock, rating);
    }

    @GetMapping("/query-find-product")
    public Product findProductQP(@RequestParam Integer id) {
        return productService.findProductById(id);
    }

    @PostMapping("/query-delete")
    public void deleteProductQp(@RequestParam Integer id){
        productService.deleteProduct(id);
    }

}

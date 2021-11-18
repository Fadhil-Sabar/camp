package com.enigma.vica;

import com.enigma.vica.config.DBConnector;
import com.enigma.vica.product.ProductDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            ProductDAO productDAO = new ProductDAO();
//            productDAO.insertProduct("Mie", 3000, 2, 4);
            String result = productDAO.getProductById(1);
            System.out.println(result);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

package com.enigma.vica.product;

import com.enigma.vica.config.DBConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO {
    private Connection connection;

    public void insertProduct(String name, Integer price, Integer stock, Integer rating) throws SQLException {
        DBConnector dbConnector = new DBConnector();
        connection = dbConnector.connect();

        String sql = "INSERT INTO product (name, price, stock, rating) VALUES (?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, price);
        preparedStatement.setInt(3, stock);
        preparedStatement.setInt(4, rating);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public String getProductById(Integer prodId) throws SQLException {
        DBConnector dbConnector = new DBConnector();
        connection = dbConnector.connect();

        String sql = "SELECT * FROM product WHERE product_id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, prodId);

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        Integer productId = resultSet.getInt(1);
        String name = resultSet.getString(2);
        Integer price = resultSet.getInt(3);
        Integer stock = resultSet.getInt(4);
        Integer rating = resultSet.getInt(5);

        preparedStatement.close();
        connection.close();

        return String.format("%d %s %d %d %d", productId, name, price, stock, rating);
    }
}

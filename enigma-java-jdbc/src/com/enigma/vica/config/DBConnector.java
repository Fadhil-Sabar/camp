package com.enigma.vica.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    public Connection connect(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/vica", "postgres", "Fadirudiru14");
            System.out.println("Connected to the postgreSQL server successfully!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}

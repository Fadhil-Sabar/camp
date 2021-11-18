package com.enigma.vica.dao;

import com.enigma.vica.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
//dari sini lari ke transacion sservice

@Repository
public class TransactionDaoImpl implements TransactionDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void insertTransaction(Transaction transaction) {
        String sql = "INSERT INTO transaction (customer_id, product_id, trx_date, sub_price, quantity)" + " VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, transaction.getCustomerId(), transaction.getProductId(), transaction.getDate(), transaction.getSubPrice(), transaction.getQty());

    }
}

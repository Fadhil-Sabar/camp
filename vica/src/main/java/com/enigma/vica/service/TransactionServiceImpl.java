package com.enigma.vica.service;

import com.enigma.vica.dao.TransactionDao;
import com.enigma.vica.model.Product;
import com.enigma.vica.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionDao transactionDao;

    @Autowired
    ProductService productService;
//    autowiring boleh dilaukan trx ke product antar service tapi tdk disarankan cross repo
    @Override
    public void insertTransaction(Transaction transaction) {
        Product product = productService.findProductById(transaction.getProductId());
        transaction.setSubPrice(product.getPrice() * transaction.getQty());
        productService.updateProduct(product.getStock() - transaction.getQty(), transaction.getProductId());
        transactionDao.insertTransaction(transaction);
    }
}

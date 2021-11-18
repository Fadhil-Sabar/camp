package com.enigma.vica.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

public class Transaction {
    Integer id;
    Integer customerId;
    Integer productId;
    @DateTimeFormat(pattern = "yyyy.MM.dd")
    Date date;
    Integer subPrice;
    Integer qty;

    public Transaction() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getSubPrice() {
        return subPrice;
    }

    public void setSubPrice(Integer subPrice) {
        this.subPrice = subPrice;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Transaction(Integer id, Integer customerId, Integer productId, Date date, Integer subPrice, Integer qty) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.date = date;
        this.subPrice = subPrice;
        this.qty = qty;
    }
}

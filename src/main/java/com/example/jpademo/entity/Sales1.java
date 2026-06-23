package com.example.jpademo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sales1 {

    @Id
    private int saleid;

    private int quantity;

    private double pricepersold;

    @ManyToOne
    @JoinColumn(name = "proid")
    private Product1 product;

    public Sales1() {
    }

    public int getSaleid() {
        return saleid;
    }

    public void setSaleid(int saleid) {
        this.saleid = saleid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricepersold() {
        return pricepersold;
    }

    public void setPricepersold(double pricepersold) {
        this.pricepersold = pricepersold;
    }

    public Product1 getProduct() {
        return product;
    }

    public void setProduct(Product1 product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return saleid + " "
                + quantity + " "
                + pricepersold;
    }
}
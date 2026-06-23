package com.example.jpademo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product1 {

    @Id
    private int proid;

    private String proname;

    private double price;

    public Product1() {
    }

    public Product1(int proid,
                    String proname,
                    double price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
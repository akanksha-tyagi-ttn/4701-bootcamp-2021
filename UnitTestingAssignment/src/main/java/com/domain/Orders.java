package com.domain;
public class Orders{

    private int quantity;
    private String itemName;
    private double price;
    private double priceWithTex;

    public Orders() {}

    public Orders(int quantity, String itemName, double price) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Orders setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public Orders setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Orders setPrice(double price) {
        this.price = price;
        return this;
    }

    public double getPriceWithTex() {
        return priceWithTex;
    }

    public Orders setPriceWithTex(double priceWithTex) {
        this.priceWithTex = priceWithTex;
        return this;
    }
}


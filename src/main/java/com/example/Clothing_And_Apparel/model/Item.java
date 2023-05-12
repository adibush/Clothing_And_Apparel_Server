package com.example.Clothing_And_Apparel.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
    private int id;

    private String title;

    private double price;

    private String image;

    @JsonProperty(value = "item_stock")
    private int itemStock;

    public Item(int id, String title, double price, String image, int itemStock) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.image = image;
        this.itemStock = itemStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getItemStock() {
        return itemStock;
    }

    public void setItemStock(int itemStock) {
        this.itemStock = itemStock;
    }
}

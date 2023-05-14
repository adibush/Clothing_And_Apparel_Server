package com.example.Clothing_And_Apparel.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Favorite {

    private int id;
    @JsonProperty(value = "item_id")
    private int itemId;
    @JsonProperty(value = "user_name")
    private String userName;

    private String title;

    private double price;

    private String image;

    @JsonProperty(value = "item_stock")
    private int itemStock;


    public Favorite(int id, int itemId, String userName, String title, double price, String image, int itemStock) {
        this.id = id;
        this.itemId = itemId;
        this.userName = userName;
        this.title = title;
        this.price = price;
        this.image = image;
        this.itemStock = itemStock;
    }

    public Favorite() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

package com.example.Clothing_And_Apparel.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemOrders {
    private int id;
    @JsonProperty(value = "orders_id")
    private int ordersId;
    @JsonProperty(value = "item_id")
    private int itemId;

    @JsonProperty(value = "user_name")
    private String userName;

    private String title;

    private double price;

    private String image;

    private Status status;

    public ItemOrders(int id, int ordersId, int itemId, String userName, String title, double price, String image, Status status) {
        this.id = id;
        this.ordersId = ordersId;
        this.itemId = itemId;
        this.userName = userName;
        this.title = title;
        this.price = price;
        this.image = image;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
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

}

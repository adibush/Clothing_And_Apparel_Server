package com.example.Clothing_And_Apparel.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class Orders {
    private Long id;
    @JsonProperty(value = "user_name")
    private String userName;
    @JsonProperty(value = "date_time")
    private String dateTime;
    @JsonProperty(value = "shipping_address")
    private String shippingAddress;
    @JsonProperty(value = "total_price")
    private double totalPrice;
    private Status status;

    public Orders(Long id, String userName, String dateTime, String shippingAddress, double totalPrice, Status status) {
        this.id = id;
        this.userName = userName;
        this.dateTime = dateTime;
        this.shippingAddress = shippingAddress;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

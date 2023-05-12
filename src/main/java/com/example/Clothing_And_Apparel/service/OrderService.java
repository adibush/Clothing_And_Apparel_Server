package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.model.Orders;

import java.util.List;

public interface OrderService {

    Long postOrders(Orders orders);

    void deleteOrdersById(int id);

    void updateOrders(Orders orders);

    Orders getOrdersById(int id);

    List<Orders> getOrderByUserName(String userName);
}

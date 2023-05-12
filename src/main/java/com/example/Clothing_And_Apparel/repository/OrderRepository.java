package com.example.Clothing_And_Apparel.repository;

import com.example.Clothing_And_Apparel.model.ItemOrders;
import com.example.Clothing_And_Apparel.model.Orders;

import java.util.List;

public interface OrderRepository {

    Long postOrders(Orders orders);

    void deleteOrdersById(int id);

    void updateOrders(Orders orders);

    Orders getOrdersById(int id);

    List<Orders> getOrderByUserName(String userName);
}

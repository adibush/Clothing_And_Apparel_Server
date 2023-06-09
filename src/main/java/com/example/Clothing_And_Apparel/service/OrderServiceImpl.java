package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.model.Orders;
import com.example.Clothing_And_Apparel.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{


    @Autowired
    OrderRepository orderRepository;


    @Override
    public Long postOrders(Orders orders,String userName) {
        return orderRepository.postOrders(orders,userName);

    }

    @Override
    public void deleteOrdersByUserName(String userName) {
        orderRepository.deleteOrdersByUserName(userName);

    }

    @Override
    public void updateOrders(Orders orders) {
        orderRepository.updateOrders(orders);

    }

    @Override
    public Orders getOrdersById(int id) {
        return orderRepository.getOrdersById(id);
    }

    @Override
    public List<Orders> getOrderByUserName(String userName) {
        return orderRepository.getOrderByUserName(userName);
    }
}

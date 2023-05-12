package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.model.ItemOrders;
import com.example.Clothing_And_Apparel.repository.ItemOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemOrderServiceImpl implements ItemOrderService{


    @Autowired
    ItemOrderRepository itemOrderRepository;
    @Override
    public void postItemOrders(ItemOrders itemOrders) {
        itemOrderRepository.postItemOrders(itemOrders);

    }

    @Override
    public void deleteItemOrdersByItemId(int userId) {
        itemOrderRepository.deleteItemOrdersByItemId(userId);

    }

    @Override
    public void updateItemOrders(ItemOrders itemOrders) {
        itemOrderRepository.updateItemOrders(itemOrders);

    }

    @Override
    public List<ItemOrders> getItemOrdersByUserName(String userName) {
        return itemOrderRepository.getItemOrdersByUserName(userName);

    }

    @Override
    public List<ItemOrders> getItemOrdersCloseByOrderId(Integer orderId) {
        return itemOrderRepository.getItemOrdersCloseByOrderId(orderId);
    }
}

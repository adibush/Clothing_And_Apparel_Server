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
    public void postItemOrders(ItemOrders itemOrders,String userName) {
        itemOrderRepository.postItemOrders(itemOrders,userName);

    }

    @Override
    public void deleteItemOrdersByItemId(int userId) {
        itemOrderRepository.deleteItemOrdersByItemId(userId);

    }

    @Override
    public void deleteItemOrdersByUserName(String userName) {
        itemOrderRepository.deleteItemOrdersByUserName(userName);
    }

    @Override
    public void updateItemOrders(ItemOrders itemOrders,String userName) {
        itemOrderRepository.updateItemOrders(itemOrders,userName);

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

package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.model.ItemOrders;

import java.util.List;

public interface ItemOrderService {
    void postItemOrders(ItemOrders itemOrders,String userName);

    void deleteItemOrdersByItemId(int userId);

    void deleteItemOrdersByUserName(String userName);

    void updateItemOrders(ItemOrders itemOrders,String userName);

    List<ItemOrders> getItemOrdersByUserName(String userName);

    List<ItemOrders> getItemOrdersCloseByOrderId(Integer orderId);
}

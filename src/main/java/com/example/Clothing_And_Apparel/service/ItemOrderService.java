package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.model.ItemOrders;

import java.util.List;

public interface ItemOrderService {
    void postItemOrders(ItemOrders itemOrders);

    void deleteItemOrdersByItemId(int userId);

    void updateItemOrders(ItemOrders itemOrders);

    List<ItemOrders> getItemOrdersByUserName(String userName);

    List<ItemOrders> getItemOrdersCloseByOrderId(Integer orderId);
}

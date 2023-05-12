package com.example.Clothing_And_Apparel.repository;

import com.example.Clothing_And_Apparel.model.Item;
import com.example.Clothing_And_Apparel.model.ItemOrders;

import java.util.List;

public interface ItemOrderRepository {

    void postItemOrders(ItemOrders itemOrders);

    void deleteItemOrdersByItemId(int itemId);

    void updateItemOrders(ItemOrders itemOrders);

    List<ItemOrders> getItemOrdersByUserName(String userName);

    List<ItemOrders> getItemOrdersCloseByOrderId(Integer orderId);



}

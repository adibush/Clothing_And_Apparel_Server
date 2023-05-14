package com.example.Clothing_And_Apparel.repository;

import com.example.Clothing_And_Apparel.model.Item;
import com.example.Clothing_And_Apparel.model.ItemOrders;

import java.util.List;

public interface ItemOrderRepository {

    void postItemOrders(ItemOrders itemOrders,String userName);

    void deleteItemOrdersByItemId(int itemId);

    void deleteItemOrdersByUserName(String userName);

    void updateItemOrders(ItemOrders itemOrders,String userName);

    List<ItemOrders> getItemOrdersByUserName(String userName);

    List<ItemOrders> getItemOrdersCloseByOrderId(Integer orderId);



}

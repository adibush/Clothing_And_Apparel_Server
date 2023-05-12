package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.model.Item;

import java.util.List;


public interface ItemService {
    void postItem(Item item);

    void deleteItemById(int id);

    void updateMinusItemStockById(Item item);

    void updatePlusItemStockById(Item item);

    Item getItemById(int id);

    List<Item> getAllItem();

    List<Item> getItemByName(String name);
}

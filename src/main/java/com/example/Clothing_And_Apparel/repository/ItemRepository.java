package com.example.Clothing_And_Apparel.repository;

import com.example.Clothing_And_Apparel.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ItemRepository {


    void postItem(Item item);

    void deleteItemById(int id);

    void updateMinusItemStockById(Item item);

    void updatePlusItemStockById(Item item);


    Item getItemById(int id);

    List<Item> getAllItem();

    List<Item> getItemByName(String name);




}

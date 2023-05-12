package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.model.Item;
import com.example.Clothing_And_Apparel.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepository itemRepository;



    @Override
    public void postItem(Item item) {
       itemRepository.postItem(item);

    }

    @Override
    public void deleteItemById(int id) {
        itemRepository.deleteItemById(id);

    }

    @Override
    public void updateMinusItemStockById(Item item) {
        itemRepository.updateMinusItemStockById(item);
    }

    @Override
    public void updatePlusItemStockById(Item item) {
        itemRepository.updatePlusItemStockById(item);
    }


    @Override
    public Item getItemById(int id) {
        return itemRepository.getItemById(id);
    }

    @Override
    public List<Item> getAllItem() {
        return itemRepository.getAllItem();
    }

    @Override
    public List<Item> getItemByName(String name) {
        return itemRepository.getItemByName(name);

    }
}

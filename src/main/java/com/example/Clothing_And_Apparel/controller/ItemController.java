package com.example.Clothing_And_Apparel.controller;

import com.example.Clothing_And_Apparel.model.Item;
import com.example.Clothing_And_Apparel.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping(value = "/create")
    public void postItem(@RequestBody Item item) {
        itemService.postItem(item);
    }

    @DeleteMapping(value = "/delete")
    public void deleteItem(@RequestParam Integer id) {
        itemService.deleteItemById(id);
    }

    @PutMapping(value = "/update/minus")
    @CrossOrigin
    public void updateMinusStockItemById(@RequestBody Item item) {
        itemService.updateMinusItemStockById(item);
    }

    @PutMapping(value = "/update/plus")
    @CrossOrigin
    public void updatePlusStockItemById(@RequestBody Item item) {
        itemService.updatePlusItemStockById(item);
    }


    @GetMapping(value = "/get", params = "id")
    public Item getItemById(@RequestParam Integer id) {
        return itemService.getItemById(id);
    }

    @GetMapping(value = "/all")
    @CrossOrigin
    public List<Item> getAllItem() {
        return itemService.getAllItem();
    }

    @GetMapping(value = "/name")
    @CrossOrigin
    public List<Item> getItemByName(@RequestParam String name) {
        return itemService.getItemByName(name);
    }

}

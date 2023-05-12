package com.example.Clothing_And_Apparel.controller;

import com.example.Clothing_And_Apparel.model.Item;
import com.example.Clothing_And_Apparel.model.ItemOrders;
import com.example.Clothing_And_Apparel.service.ItemOrderService;
import com.example.Clothing_And_Apparel.service.ItemService;
import com.example.Clothing_And_Apparel.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( value = "/item/orders")
public class ItemOrdersController {
    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    ItemOrderService itemOrderService;

    @PostMapping(value = "/create")
    @CrossOrigin
    public void postItemOrders(@RequestBody ItemOrders itemOrders){
        itemOrderService.postItemOrders(itemOrders);
    }

    @DeleteMapping(value = "/delete" , params = "id")
    @CrossOrigin
    public void deleteItemOrders (@RequestParam Integer id){
        itemOrderService.deleteItemOrdersByItemId(id);
    }

    @PutMapping(value = "/update")
    @CrossOrigin
    public void updateItemOrders (@RequestBody ItemOrders itemOrders){
        itemOrderService.updateItemOrders(itemOrders);
    }

    @GetMapping(value = "/get")
    @CrossOrigin
    public List<ItemOrders> getItemOrdersByUserName(@RequestParam(value = "Authorization")String token){
        String jwt =token.substring(7);
        String userName = jwtUtil.extractUsername(jwt);
        return itemOrderService.getItemOrdersByUserName(userName);
    }

    @GetMapping(value = "/get/close",params = "orders_id")
    @CrossOrigin
    public List<ItemOrders> getItemOrdersCloseByOrderId(@RequestParam Integer orders_id){
        return itemOrderService.getItemOrdersCloseByOrderId(orders_id);
    }


}

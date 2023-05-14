package com.example.Clothing_And_Apparel.controller;

import com.example.Clothing_And_Apparel.model.Orders;
import com.example.Clothing_And_Apparel.service.OrderService;
import com.example.Clothing_And_Apparel.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( value = "/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping(value = "/create")
    @CrossOrigin
    public Long postOrders(@RequestBody Orders orders,@RequestParam(value = "Authorization")String token) {
        String jwt =token.substring(7);
        String userName = jwtUtil.extractUsername(jwt);
        return orderService.postOrders(orders,userName);
    }

    @DeleteMapping(value = "/delete")
    public void deleteOrders (@RequestParam String userName){
        orderService.deleteOrdersByUserName(userName);
    }

    @PutMapping(value = "/update")
    public void updateOrders (@RequestBody Orders orders){
        orderService.updateOrders(orders);
    }

    @GetMapping(value = "/get",params = "id")
    public Orders getOrdersById(@RequestParam Integer id){
        return orderService.getOrdersById(id);
    }

    @GetMapping(value = "/get/all")
    @CrossOrigin
    public List<Orders> getOrderByUserName(@RequestParam(value = "Authorization")String token){
        String jwt =token.substring(7);
        String userName = jwtUtil.extractUsername(jwt);
        return orderService.getOrderByUserName(userName);
    }




}

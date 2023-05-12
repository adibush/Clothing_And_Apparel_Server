package com.example.Clothing_And_Apparel.repository;

import com.example.Clothing_And_Apparel.model.Item;
import com.example.Clothing_And_Apparel.model.ItemOrders;
import com.example.Clothing_And_Apparel.model.Orders;
import com.example.Clothing_And_Apparel.repository.mapper.ItemMapper;
import com.example.Clothing_And_Apparel.repository.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository{

    private static final String ORDERS_TABLE = "orders";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Long postOrders(Orders orders) {
        String sql = String.format("INSERT INTO %s (user_name,date_time, shipping_address,total_price,status) VALUES (?,?,?,?,?)", ORDERS_TABLE);
        jdbcTemplate.update(sql,
                orders.getUserName(),
                orders.getDateTime(),
                orders.getShippingAddress(),
                orders.getTotalPrice(),
                orders.getStatus().name());
        return jdbcTemplate.queryForObject("SELECT id FROM " + ORDERS_TABLE + " ORDER BY id DESC LIMIT 1", Long.class);
    }


    @Override
    public void deleteOrdersById(int id) {
        String sql = String.format("DELETE FROM %s WHERE id = ?",ORDERS_TABLE);
        jdbcTemplate.update(sql,id);


    }

    @Override
    public void updateOrders(Orders orders) {
        String sql = String.format("UPDATE %s SET user_name = ?, date_time = ?, shipping_address = ?,total_price= ?,status=? WHERE id = ?",ORDERS_TABLE);
        jdbcTemplate.update(sql,
              orders.getUserName(),
                orders.getDateTime(),
                orders.getShippingAddress(),
                orders.getTotalPrice(),
                orders.getStatus().name(),
                orders.getId());

    }

    @Override
    public Orders getOrdersById(int id) {
        String sql = String.format("SELECT * FROM %s WHERE id = ?",ORDERS_TABLE);
        try{
            Orders orders = jdbcTemplate.queryForObject(sql,new OrdersMapper(),id);
            return orders;
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<Orders> getOrderByUserName(String userName) {
        String sql= String.format("SELECT * FROM %s WHERE user_name= ? AND status= 'CLOSE'",ORDERS_TABLE);
        try{
            return jdbcTemplate.query(sql,new OrdersMapper(),userName);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

}

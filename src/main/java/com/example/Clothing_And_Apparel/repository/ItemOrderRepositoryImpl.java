package com.example.Clothing_And_Apparel.repository;

import com.example.Clothing_And_Apparel.model.ItemOrders;
import com.example.Clothing_And_Apparel.repository.mapper.ItemOrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemOrderRepositoryImpl implements  ItemOrderRepository {


    private static final String ITEM_ORDERS_TABLE = "item_orders";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void postItemOrders(ItemOrders itemOrders,String userName) {
        String sql = String.format("INSERT INTO %s (orders_id, item_id,user_name,title,price,image,status) VALUES (?,?,?,?,?,?,?)", ITEM_ORDERS_TABLE);
        jdbcTemplate.update(sql,
                itemOrders.getOrdersId(),
                itemOrders.getItemId(),
                userName,
                itemOrders.getTitle(),
                itemOrders.getPrice(),
                itemOrders.getImage(),
                itemOrders.getStatus().name());
    }

    @Override
    public void deleteItemOrdersByItemId(int itemId) {
        String sql = String.format("DELETE FROM %s WHERE item_id = ? AND status='TEMP' ",ITEM_ORDERS_TABLE);
        jdbcTemplate.update(sql,itemId);
    }

    @Override
    public void deleteItemOrdersByUserName(String userName) {
        String sql =String.format("DELETE FROM %s WHERE user_name=? ",ITEM_ORDERS_TABLE);
        jdbcTemplate.update(sql,userName);
    }

    @Override
    public void updateItemOrders(ItemOrders itemOrders,String userName) {
        String sql = String.format("UPDATE %s SET orders_id = ?,status =? WHERE  user_name=? AND status='TEMP' ",ITEM_ORDERS_TABLE);
        jdbcTemplate.update(sql,
                itemOrders.getOrdersId(),
                itemOrders.getStatus().name(),
                userName);

    }

    @Override
    public List<ItemOrders> getItemOrdersByUserName(String userName) {
        String sql = String.format("SELECT * FROM %s WHERE  user_name=? AND status='TEMP'",ITEM_ORDERS_TABLE);
        try{
              return jdbcTemplate.query(sql,new ItemOrdersMapper(),userName);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<ItemOrders> getItemOrdersCloseByOrderId(Integer orderId) {
        String sql = String.format("SELECT * FROM %s WHERE orders_id=?",ITEM_ORDERS_TABLE);
        try{
            return jdbcTemplate.query(sql,new ItemOrdersMapper(),orderId);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }
}

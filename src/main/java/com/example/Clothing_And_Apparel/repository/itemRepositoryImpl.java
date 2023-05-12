package com.example.Clothing_And_Apparel.repository;

import com.example.Clothing_And_Apparel.model.Item;
import com.example.Clothing_And_Apparel.repository.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class itemRepositoryImpl implements ItemRepository{

    private static final String ITEM_TABLE = "item";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void postItem(Item item) {
        String sql = String.format("INSERT INTO %s (title, price,image, item_stock) VALUES (?,?,?,?)", ITEM_TABLE);
        jdbcTemplate.update(sql,
                item.getTitle(),
                item.getPrice(),
                item.getImage(),
                item.getItemStock());
    }


    @Override
    public void deleteItemById(int id) {
        String sql = String.format("DELETE FROM %s WHERE id = ?",ITEM_TABLE);
        jdbcTemplate.update(sql,id);

    }

    @Override
    public void updateMinusItemStockById(Item item) {
        String sql = String.format("UPDATE %s SET item_stock = item_stock-1 WHERE id = ?",ITEM_TABLE);
        jdbcTemplate.update(sql,item.getId());
    }

    @Override
    public void updatePlusItemStockById(Item item) {
        String sql = String.format("UPDATE %s SET item_stock = item_stock+1 WHERE id = ?",ITEM_TABLE);
        jdbcTemplate.update(sql,item.getId());

    }


    @Override
    public Item getItemById(int id) {
        String sql = String.format("SELECT * FROM %s WHERE id = ?",ITEM_TABLE);
        try{
            Item item = jdbcTemplate.queryForObject(sql,new ItemMapper(),id);
            return item;
        }catch (EmptyResultDataAccessException e){
            System.out.println("No result");
            return null;
        }
    }

    @Override
    public List<Item> getAllItem() {
        String sql = String.format("SELECT * FROM %s",ITEM_TABLE);
        try{
            return jdbcTemplate.query(sql,new ItemMapper());
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<Item> getItemByName(String name) {
        String sql = String.format("SELECT * FROM %s WHERE title LIKE '%%%s%%' ",ITEM_TABLE,name);
        try{
            return jdbcTemplate.query(sql,new ItemMapper());
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }



}

package com.example.Clothing_And_Apparel.repository.mapper;

import com.example.Clothing_And_Apparel.model.Item;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemMapper implements RowMapper<Item> {
    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Item(rs.getInt("id"),
                rs.getString("title"),
                rs.getDouble("price"),
                rs.getString("image"),
                rs.getInt("item_stock"));
    }
}

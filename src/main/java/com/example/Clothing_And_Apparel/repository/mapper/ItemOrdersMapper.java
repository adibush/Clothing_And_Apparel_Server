package com.example.Clothing_And_Apparel.repository.mapper;

import com.example.Clothing_And_Apparel.model.ItemOrders;
import com.example.Clothing_And_Apparel.model.Status;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemOrdersMapper implements RowMapper<ItemOrders> {
    @Override
    public ItemOrders mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ItemOrders(rs.getInt("id"),
                rs.getInt("orders_id"),
                rs.getInt("item_id"),
                rs.getString("user_name"),
                rs.getString("title"),
                rs.getDouble("price"),
                rs.getString("image"),
                Status.valueOf(rs.getString("status")));
    }
}

package com.example.Clothing_And_Apparel.repository.mapper;

import com.example.Clothing_And_Apparel.model.Orders;
import com.example.Clothing_And_Apparel.model.Status;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdersMapper implements RowMapper<Orders> {
    @Override
    public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Orders(rs.getLong("id"),
                rs.getString("user_name"),
                rs.getString("date_time"),
                rs.getString("shipping_address"),
                rs.getDouble("total_price"),
                Status.valueOf(rs.getString("status")));
    }
}

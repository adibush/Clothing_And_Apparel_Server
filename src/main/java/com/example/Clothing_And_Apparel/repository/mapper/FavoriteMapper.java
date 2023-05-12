package com.example.Clothing_And_Apparel.repository.mapper;

import com.example.Clothing_And_Apparel.model.Favorite;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FavoriteMapper implements RowMapper<Favorite> {
    @Override
    public Favorite mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Favorite(rs.getInt("id"),
                rs.getInt("item_id"),
                rs.getString("user_name"),
                rs.getString("title"),
                rs.getDouble("price"),
                rs.getString("image"),
                rs.getInt("item_stock"));
    }
}

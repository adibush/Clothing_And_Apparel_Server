package com.example.Clothing_And_Apparel.repository.mapper;

import com.example.Clothing_And_Apparel.model.CustomUser;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomUserMapper implements RowMapper<CustomUser> {
    @Override
    public CustomUser mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new CustomUser(rs.getInt("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("user_name"),
                rs.getString("password"),
                rs.getString("email"),
                rs.getString("phone"),
                rs.getString("address"));
    }
}

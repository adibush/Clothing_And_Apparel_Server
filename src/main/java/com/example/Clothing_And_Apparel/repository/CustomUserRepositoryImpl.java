package com.example.Clothing_And_Apparel.repository;

import com.example.Clothing_And_Apparel.model.CustomUser;
import com.example.Clothing_And_Apparel.repository.mapper.CustomUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomUserRepositoryImpl implements CustomUserRepository {

    private static final String USER_TABLE = "users";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void postUser(CustomUser customUser) {
        String sql = String.format("INSERT INTO %s (first_name, last_name ,user_name, password,email,phone,address) VALUES (?,?,?,?,?,?,?)", USER_TABLE);
        jdbcTemplate.update(sql,
                customUser.getFirstName(),
                customUser.getLastName(),
                customUser.getUserName(),
                customUser.getPassword(),
                customUser.getEmail(),
                customUser.getPhone(),
                customUser.getAddress());

    }

    @Override
    public void deleteUserByUserName(String userName) {
        String sql = String.format("DELETE FROM %s WHERE user_name = ?", USER_TABLE);
        jdbcTemplate.update(sql, userName);

    }

    @Override
    public void updateUser(CustomUser customUser) {
        String sql = String.format("UPDATE %s SET first_name = ?, last_name = ?,user_name=?, password = ?,email= ?,phone=?,address=? WHERE id = ?", USER_TABLE);
        jdbcTemplate.update(sql,
                customUser.getFirstName(),
                customUser.getLastName(),
                customUser.getUserName(),
                customUser.getPassword(),
                customUser.getEmail(),
                customUser.getPhone(),
                customUser.getAddress(),
                customUser.getId());

    }

    @Override
    public CustomUser getUserById(int id) {
        String sql = String.format("SELECT * FROM %s WHERE id = ?", USER_TABLE);
        try {
            CustomUser customUser = jdbcTemplate.queryForObject(sql, new CustomUserMapper(), id);
            return customUser;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public Integer getPasswordByPhone(String phone) {
        String sql = String.format("SELECT password FROM %s WHERE phone =?", USER_TABLE);
        try {
            return jdbcTemplate.queryForObject(sql, Integer.class, phone);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }

    @Override
    public List<String> getAllPhone() {
        String sql = String.format("SELECT phone FROM %s", USER_TABLE);
        try {
            return jdbcTemplate.queryForList(sql, String.class);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }


    public CustomUser findUserByUsername(String username) {
        String sql = String.format("SELECT * FROM %s WHERE user_name=?", USER_TABLE);
        try {
            return jdbcTemplate.queryForObject(sql, new CustomUserMapper(), username);
        } catch (EmptyResultDataAccessException error) {
            return null;
        }
    }
}


package com.example.Clothing_And_Apparel.repository;

import com.example.Clothing_And_Apparel.model.CustomUser;

import java.util.List;

public interface CustomUserRepository {

    void postUser(CustomUser customUser);

    void deleteUserById(int id);

    void updateUser(CustomUser customUser);

    CustomUser getUserById(int id);

    Integer getPasswordByPhone(String phone);

    List<String> getAllPhone();

    CustomUser findUserByUsername(String username);
}

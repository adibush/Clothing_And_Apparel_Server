package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.model.CustomUser;

import java.util.List;

public interface CustomUserService {

    void postUser(CustomUser customUser) throws Exception;

    void deleteUserById(int id);

    void updateUser(CustomUser customUser);

    CustomUser getUserById(int id);

    Integer getPasswordByPhone(String phone);

    List<String> getAllPhone();

    CustomUser findUserByUsername(String username) ;
}

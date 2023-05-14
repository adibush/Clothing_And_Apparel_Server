package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.model.CustomUser;
import com.example.Clothing_And_Apparel.repository.CustomUserRepository;
import com.example.Clothing_And_Apparel.repository.FavoriteRepository;
import com.example.Clothing_And_Apparel.repository.ItemOrderRepository;
import com.example.Clothing_And_Apparel.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserServiceImpl implements CustomUserService {

    @Autowired
    CustomUserRepository customUserRepository;

    @Autowired
    FavoriteRepository favoriteRepository;

    @Autowired
    ItemOrderRepository itemOrderRepository;

    @Autowired
    OrderRepository orderRepository;




    @Override
    public void postUser(CustomUser customUser) throws Exception {
        CustomUser existingCustomUser = customUserRepository.findUserByUsername(customUser.getUserName());
        if(existingCustomUser != null){
            throw new Exception("username"+ customUser.getUserName()+ "is already taken");
        }
        customUserRepository.postUser(customUser);
    }

    @Override
    public void deleteUserByUserName(String userName) {
        customUserRepository.deleteUserByUserName(userName);
        favoriteRepository.deleteFavoriteItemByUserName(userName);
        itemOrderRepository.deleteItemOrdersByUserName(userName);
        orderRepository.deleteOrdersByUserName(userName);

    }

    @Override
    public void updateUser(CustomUser customUser) {
        customUserRepository.updateUser(customUser);

    }

    @Override
    public CustomUser getUserById(int id) {
        return customUserRepository.getUserById(id);
    }

    @Override
    public Integer getPasswordByPhone(String phone) {
        return customUserRepository.getPasswordByPhone(phone);
    }

    @Override
    public List<String> getAllPhone() {
        return customUserRepository.getAllPhone();
    }

    @Override
    public CustomUser findUserByUsername(String username) {
        return customUserRepository.findUserByUsername(username);
    }
}

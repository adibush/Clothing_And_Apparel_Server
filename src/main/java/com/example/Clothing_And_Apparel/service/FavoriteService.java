package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.model.Favorite;

import java.util.List;

public interface FavoriteService {
    void postFavoriteItem(Favorite favorite,String userName);

    void deleteFavoriteItemByUserName(String userName);

    void deleteFavoriteItemByItemId(Integer itemId);


    void updateFavoriteItem(Favorite favorite);

    List<Favorite> getFavoriteItemByUserName(String userName);
}

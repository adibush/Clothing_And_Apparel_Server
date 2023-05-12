package com.example.Clothing_And_Apparel.repository;

import com.example.Clothing_And_Apparel.model.Favorite;
import com.example.Clothing_And_Apparel.model.ItemOrders;

import java.util.List;

public interface FavoriteRepository {


    void postFavoriteItem(Favorite favorite);

    void deleteFavoriteItemByUserName(String userName);

    void deleteFavoriteItemByItemId(Integer itemId);

    void updateFavoriteItem(Favorite favorite);

    List<Favorite> getFavoriteItemByUserName(String userName);
}

package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.model.Favorite;
import com.example.Clothing_And_Apparel.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FavoriteServiceImpl implements FavoriteService{


    @Autowired
    FavoriteRepository favoriteRepository;



    @Override
    public void postFavoriteItem(Favorite favorite,String userName) {
        favoriteRepository.postFavoriteItem(favorite,userName);

    }

    @Override
    public void deleteFavoriteItemByUserName(String userName) {
        favoriteRepository.deleteFavoriteItemByUserName(userName);

    }

    @Override
    public void deleteFavoriteItemByItemId(Integer itemId) {
        favoriteRepository.deleteFavoriteItemByItemId(itemId);
    }

    @Override
    public void updateFavoriteItem(Favorite favorite) {
        favoriteRepository.updateFavoriteItem(favorite);

    }

    @Override
    public List<Favorite> getFavoriteItemByUserName(String userName) {
        return favoriteRepository.getFavoriteItemByUserName(userName);
    }
}

package com.example.Clothing_And_Apparel.controller;

import com.example.Clothing_And_Apparel.model.Favorite;
import com.example.Clothing_And_Apparel.model.ItemOrders;
import com.example.Clothing_And_Apparel.service.FavoriteService;
import com.example.Clothing_And_Apparel.service.ItemService;
import com.example.Clothing_And_Apparel.utils.JwtUtil;
import com.sun.tools.jconsole.JConsoleContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( value = "/favorite")
public class FavoriteController {

    @Autowired
    FavoriteService favoriteService;

    @Autowired
    JwtUtil jwtUtil;



    @PostMapping(value = "/create")
    @CrossOrigin
    public void postFavorite(@RequestBody Favorite favorite){
        favoriteService.postFavoriteItem(favorite);
    }

    @DeleteMapping(value = "/delete")
    public void deleteFavoriteByUserName (@RequestParam String userName){
        favoriteService.deleteFavoriteItemByUserName(userName);
    }

    @DeleteMapping(value = "/delete/item" , params = "id")
    @CrossOrigin
    public void deleteFavoriteByItemId (@RequestParam Integer id){
        favoriteService.deleteFavoriteItemByItemId(id);
    }

    @PutMapping(value = "/update")
    public void updateFavorite (@RequestBody Favorite favorite){
        favoriteService.updateFavoriteItem(favorite);
    }

    @GetMapping(value = "/get")
    @CrossOrigin
    public List<Favorite> getFavoriteItemByUserName(@RequestParam(value = "Authorization")String token){
        String jwt =token.substring(7);
        String userName = jwtUtil.extractUsername(jwt);
        return favoriteService.getFavoriteItemByUserName(userName);
    }

}

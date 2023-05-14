package com.example.Clothing_And_Apparel.repository;

import com.example.Clothing_And_Apparel.model.Favorite;
import com.example.Clothing_And_Apparel.model.ItemOrders;
import com.example.Clothing_And_Apparel.repository.mapper.FavoriteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class FavoriteRepositoryImpl implements  FavoriteRepository{



    private static final String FAVORITE = "favorite";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void postFavoriteItem(Favorite favorite,String userName) {
        String sql = String.format("INSERT INTO %s ( item_id,user_name,title, price,image, item_stock) VALUES (?,?,?,?,?,?)", FAVORITE);
        jdbcTemplate.update(sql,
                favorite.getItemId(),
                userName,
                favorite.getTitle(),
                favorite.getPrice(),
                favorite.getImage(),
                favorite.getItemStock());

    }

    @Override
    public void deleteFavoriteItemByUserName(String userName) {
        String sql = String.format("DELETE FROM %s WHERE user_name = ?",FAVORITE);
        jdbcTemplate.update(sql,userName);

    }

    @Override
    public void deleteFavoriteItemByItemId(Integer itemId) {
        String sql = String.format("DELETE FROM %s WHERE item_id = ?",FAVORITE);
        jdbcTemplate.update(sql,itemId);

    }

    @Override
    public void updateFavoriteItem(Favorite favorite) {
        String sql = String.format("UPDATE %s SET  item_id = ?,user_name=? ,title = ?, price = ?,image=? , item_stock = ? WHERE id = ?",FAVORITE);
        jdbcTemplate.update(sql,
                favorite.getItemId(),
                favorite.getUserName(),
                favorite.getTitle(),
                favorite.getPrice(),
                favorite.getImage(),
                favorite.getItemStock(),
                favorite.getId());

    }

    @Override
    public List<Favorite> getFavoriteItemByUserName(String userName) {
        String sql = String.format("SELECT * FROM %s WHERE user_name = ?",FAVORITE);
        try{
            return jdbcTemplate.query(sql,new FavoriteMapper(),userName);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }
}





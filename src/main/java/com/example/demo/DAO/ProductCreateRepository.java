package com.example.demo.DAO;

import com.example.demo.Utilities.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Ejer on 11-05-2018.
 */
@Repository
public class ProductCreateRepository {
    @Autowired
    private JdbcTemplate jdbc;

    public void createCard(Card card){
        jdbc.update("INSERT INTO farmerscrap.card(name, description, price,imagePath)" +
                "VALUES('" + card.getName() + "','" + card.getDescription() + "','" + card.getPrice() +
                "','" + card.getImagePath()+"')");
    }
}

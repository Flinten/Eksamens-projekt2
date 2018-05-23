package com.example.demo.DAO;

import com.example.demo.Utilities.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ejer on 11-05-2018.
 */
@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet sqlRowSet;

    //Taget fra TG Renovation 1 års projekt af Jakob, Mikkel, Azat og Gustav
    public List<Card> readAll() {
        ArrayList<Card> cards = new ArrayList<>();
        sqlRowSet = jdbc.queryForRowSet("SELECT * FROM card");

        while(sqlRowSet.next()){
            cards.add(new Card(sqlRowSet.getInt("cardID"), sqlRowSet.getString("name"),
                    sqlRowSet.getString("description"), sqlRowSet.getDouble("price"),
                    sqlRowSet.getString("imagePath")));
        }

        return cards;
    }

    public Card read(int cardID){
        sqlRowSet = jdbc.queryForRowSet("SELECT * FROM card WHERE cardID="+ cardID);
        while(sqlRowSet.next()){
            return new Card(sqlRowSet.getInt("cardID"),sqlRowSet.getString("name"),
                    sqlRowSet.getString("description"), sqlRowSet.getDouble("price"),
                    sqlRowSet.getString("imagePath"));
        }
        return null;
    }

}

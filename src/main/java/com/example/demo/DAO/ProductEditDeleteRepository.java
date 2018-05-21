package com.example.demo.DAO;


import com.example.demo.Utilities.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class ProductEditDeleteRepository {

    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet sqlRowSet;

    public void update(Card card, int cardID) {
        jdbc.update("UPDATE card SET "
                + "name = '" + card.getName()
                + "', description = '" + card.getDescription()
                + "', price = '" + card.getPrice()
                + "', imagePath = '" + card.getImagePath()
                + "' " + " WHERE cardID = " + cardID);
    }

    public void delete(int cardID){
        jdbc.update("DELETE FROM card WHERE cardID=" + cardID);
    }

}

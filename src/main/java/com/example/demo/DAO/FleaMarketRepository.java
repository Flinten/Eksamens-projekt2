package com.example.demo.DAO;

import com.example.demo.Utilities.FleaMarket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FleaMarketRepository {


    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet sqlRowSet;

    public List<FleaMarket> readAll() {
        ArrayList<FleaMarket> fleamarkets = new ArrayList<>();
        sqlRowSet = jdbc.queryForRowSet("SELECT * FROM fleamarket");

        while(sqlRowSet.next()){
            fleamarkets.add(new FleaMarket(sqlRowSet.getInt("fleamarketID"), sqlRowSet.getString("name"),
                    sqlRowSet.getString("description"), sqlRowSet.getDouble("price"),
                    sqlRowSet.getString("imagePath")));
        }

        return fleamarkets;
    }

    public FleaMarket read(int fleamarketID) {
        sqlRowSet = jdbc.queryForRowSet("SELECT * FROM fleamarket WHERE fleamarketID=" + fleamarketID);
        while (sqlRowSet.next()) {
            return new FleaMarket(sqlRowSet.getInt("id"), sqlRowSet.getString("name"),
                    sqlRowSet.getString("description"), sqlRowSet.getDouble("price"),
                    sqlRowSet.getString("imagePath"));
        }
        return null;
    }
}

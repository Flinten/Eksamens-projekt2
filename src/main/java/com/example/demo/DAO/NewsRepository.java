package com.example.demo.DAO;

import com.example.demo.Utilities.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Ejer on 11-05-2018.
 */

@Repository
public class NewsRepository {

    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet sqlRowSet;


//  XP projekt
    public ArrayList<News> readAll() {
        ArrayList<News> newsList = new ArrayList<>();
        sqlRowSet = jdbc.queryForRowSet("SELECT * FROM news");

        while(sqlRowSet.next()) {
            newsList.add(new News(sqlRowSet.getInt("newsID"), sqlRowSet.getString("headline"),
                            sqlRowSet.getString("description"), sqlRowSet.getDate("date"),
                            sqlRowSet.getString("imagePath")));
        }

        return newsList;
    }

}

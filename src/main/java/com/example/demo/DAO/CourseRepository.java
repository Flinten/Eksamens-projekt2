package com.example.demo.DAO;

import com.example.demo.Utilities.Card;
import com.example.demo.Utilities.Course;
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
public class CourseRepository {

    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet sqlRowSet;


    public List<Course> readAll() {
        List<Course> courses = new ArrayList<>();
        sqlRowSet = jdbc.queryForRowSet("SELECT * FROM course ORDER BY date DESC");

        while(sqlRowSet.next()){
            courses.add(new Course(sqlRowSet.getInt("courseID"), sqlRowSet.getString("headline")
                    ,sqlRowSet.getString("description"), sqlRowSet.getDate("date")
                    ,sqlRowSet.getString("imagePath") ,sqlRowSet.getDouble("price")));

        }

        return courses;
    }

}

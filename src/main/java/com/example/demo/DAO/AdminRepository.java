package com.example.demo.DAO;

import com.example.demo.Utilities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Ejer on 11-05-2018.
 */

@Repository
public class AdminRepository {

    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet sqlRowSet;


    //Taget fra TG Renovation 1 års projekt af Jakob, Mikkel, Azat og Gustav
    public Admin logIn(String username, String password){

        ArrayList<Admin> admins = new ArrayList<Admin>();
        sqlRowSet = jdbc.queryForRowSet("SELECT * FROM admin");

        while(sqlRowSet.next()){
            // indhold af sqlRowset ned i en arrayliste
            admins.add(new Admin(sqlRowSet.getString("username"),
                    sqlRowSet.getString("password")));

        }

        for (int i=0; i<admins.size(); i++) {
            if(admins.get(i).getUserName().equals(username)
                    && admins.get(i).getPassword().equals(password)) {
                return admins.get(i);
            }
        }
        return new Admin("Rofl5234Lul1124", "Lol<343ZBurgerInfinity242");
    }
}

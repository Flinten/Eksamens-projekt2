package com.example.demo.Controller;

import com.example.demo.DAO.AdminRepository;
import com.example.demo.Utilities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestAttribute;
/**
 * Created by Ejer on 11-05-2018.
 */

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String admin(){
        return "/adminFrontpage";
    }

    @Autowired
    AdminRepository adminRepository = new AdminRepository();

    //Taget fra TG Renovation 1 års projekt af Jakob, Mikkel, Azat og Gustav
    @PostMapping("/logIn")
    public String logIn(@RequestParam("username") String username,
                        @RequestParam("password") String password){

        Admin adminLogin = adminRepository.logIn(username, password);

        if (adminLogin.getUserName().equals(username) && adminLogin.getPassword().equals(password)){
            return "/adminFrontpage";
        }

        return "redirect:/";
    }

}

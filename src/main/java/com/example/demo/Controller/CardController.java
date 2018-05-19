package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Ejer on 11-05-2018.
 */
@Controller
public class CardController {

    @GetMapping("/card")
    public String card(){
        return "Card";
    }
    @GetMapping("/createCard")
    public String createCard(){
        return "CreateCard";
    }
    @GetMapping("/editCard")
    public String editCard(){
        return "EditCard";
    }
}

package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Ejer on 11-05-2018.
 */
@Controller
public class FleaMarketController {

    @GetMapping("/fleamarket")
    public String fleamarket(){
        return "Fleamarket";
    }
}

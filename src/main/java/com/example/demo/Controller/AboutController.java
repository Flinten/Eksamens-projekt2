package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Ejer on 18-05-2018.
 */
@Controller
public class AboutController {

    @GetMapping("/about")
    public String about(){
        return "about";
    }

}

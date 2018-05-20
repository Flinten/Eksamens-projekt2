package com.example.demo.Controller;

import com.example.demo.DAO.ProductCreateRepository;
import com.example.demo.Utilities.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Ejer on 11-05-2018.
 */
@Controller
public class CardController {

    @Autowired
    ProductCreateRepository pCR = new ProductCreateRepository();

    @GetMapping("/card")
    public String card(){
        return "Card";
    }

    @GetMapping("/createCard")
    public String createCard(Model model){
        model.addAttribute("newCard", new Card());
        return "CreateCard";
    }
    @PostMapping("/createC")
    public String cardCreate(@ModelAttribute Card card, @RequestParam String name, String description, double price, String imagePath){
        pCR.createCard(card);
        return "redirect:/";
    }
    @GetMapping("/editCard")
    public String editCard(){
        return "EditCard";
    }

}

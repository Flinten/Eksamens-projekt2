package com.example.demo.Controller;

import com.example.demo.DAO.ProductCreateRepository;
import com.example.demo.DAO.ProductEditDeleteRepository;
import com.example.demo.DAO.ProductRepository;
import com.example.demo.Utilities.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Ejer on 11-05-2018.
 */
@Controller
public class CardController {

    @Autowired
    ProductRepository productRepo = new ProductRepository();
    @Autowired
    ProductEditDeleteRepository productEditDeleteRepo = new ProductEditDeleteRepository();

    private int globalID;


    @GetMapping("/card")
    public String card(){
        return "card";
    }

    @GetMapping("/adminCard")
    public String adminCard(Model model){
        List<Card> cardList = productRepo.readAll();
        model.addAttribute("cardOverview", cardList);
        return "adminCard";
    }

    @GetMapping("/createCard")
    public String createCard(){
        return "createCard";
    }

    @GetMapping("/editCard")
    public String editCard(@RequestParam("cardID") int cardID, Model model){
        globalID = cardID;
        model.addAttribute("card", productRepo.read(cardID));
        return "editCard";
    }

    @PostMapping("/editCard")
    public String editCard(@RequestParam("name") String name,
                           @RequestParam("description") String description,
                           @RequestParam("price") double price,
                           @RequestParam("imagePath") String imagePath){
        productEditDeleteRepo.update(new Card(globalID, name, description, price, imagePath), globalID);
        return "redirect:/adminCard";
    }

    @GetMapping("/deleteCard")
    public String deleteCard(@RequestParam("cardID") int cardID){
        productEditDeleteRepo.delete(cardID);
        return "redirect:/adminCard";
    }
}

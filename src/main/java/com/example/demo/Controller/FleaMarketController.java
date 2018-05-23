package com.example.demo.Controller;

import com.example.demo.DAO.FleaMarketRepository;
import com.example.demo.Utilities.FleaMarket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FleaMarketController {



    @Autowired
    FleaMarketRepository FleaMarketRepo = new FleaMarketRepository();

    @GetMapping("/fleamarket")
    public String fleamarket(Model model){
        List<FleaMarket> fleamarketList = FleaMarketRepo.readAll();
        model.addAttribute("fleamarketOverview", fleamarketList);
        return "fleamarket";
    }
}

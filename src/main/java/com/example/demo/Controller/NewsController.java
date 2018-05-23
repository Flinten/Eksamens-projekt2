package com.example.demo.Controller;

import com.example.demo.DAO.NewsRepository;
import com.example.demo.Utilities.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ejer on 11-05-2018.
 */
@Controller
public class NewsController {

    @Autowired
    NewsRepository newsRepo = new NewsRepository();

    @GetMapping("/news")
    public String news(Model model){
        ArrayList<News> newsList = newsRepo.readAll();
        model.addAttribute("newsOverview", newsList);
        return "news";
    }

}

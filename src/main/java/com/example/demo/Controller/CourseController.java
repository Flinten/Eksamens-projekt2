package com.example.demo.Controller;

import com.example.demo.DAO.CourseRepository;
import com.example.demo.Utilities.Card;
import com.example.demo.Utilities.Course;
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
public class CourseController {

    @Autowired
    CourseRepository courseRepo = new CourseRepository();


    @GetMapping("/course")
    public String course(Model model){
        List<Course> courseList = new ArrayList<>();
        courseList = courseRepo.readAll();
        model.addAttribute("courseOverview", courseList);
        System.out.println(courseList);
        return "course";
    }
}

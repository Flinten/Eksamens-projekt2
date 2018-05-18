package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Ejer on 11-05-2018.
 */
@Controller
public class CourseController {

    @GetMapping("/course")
    public String course(){
        return "Course";
    }
    @GetMapping("/createCourse")
    public String createCourse(){
        return "CreateCourse";
    }
    @GetMapping("/EditCourse")
    public String editCourse(){
        return "EditCourse";
    }
}

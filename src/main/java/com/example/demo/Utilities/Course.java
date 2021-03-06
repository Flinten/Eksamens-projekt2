package com.example.demo.Utilities;

import java.sql.Date;

/**
 * Created by Ejer on 11-05-2018.
 */
public class Course {
    private int courseID;
    private String headline;
    private String description;
    private Date date;
    private String imagePath;
    private double price;

    public Course(String headline, String description, double price, Date date) {
        this.headline = headline;
        this.description = description;
        this.price = price;
        this.date = date;
    }

    public Course(int courseID, String headline, String description, Date date, String imagePath, double price) {
        this.courseID = courseID;
        this.headline = headline;
        this.description = description;
        this.date = date;
        this.imagePath = imagePath;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseID +
                ", headline='" + headline + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }


    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}

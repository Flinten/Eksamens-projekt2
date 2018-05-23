package com.example.demo.Utilities;

import java.sql.Date;

/**
 * Created by Ejer on 11-05-2018.
 */
public class Course {
    private int courseId;
    private String headline;
    private String description;
    private double price;
    private Date date;

    public Course(String headline, String description, double price, Date date) {
        this.headline = headline;
        this.description = description;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", headline='" + headline + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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
}

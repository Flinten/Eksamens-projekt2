package com.example.demo.Utilities;

import java.sql.Date;

/**
 * Created by Ejer on 11-05-2018.
 */
public class News {
    private int newsID;
    private String headline;
    private String description;
    private Date date;
    private String imagePath;

    public News(String headline, String description, Date date) {
        this.headline = headline;
        this.description = description;
        this.date = date;
    }

    public News(int newsID, String headline, String description, Date date, String imagePath) {
        this.newsID = newsID;
        this.headline = headline;
        this.description = description;
        this.date = date;
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getNewsID() {
        return newsID;
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsID=" + newsID +
                ", headline='" + headline + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}

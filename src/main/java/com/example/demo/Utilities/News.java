package com.example.demo.Utilities;

import java.sql.Date;

/**
 * Created by Ejer on 11-05-2018.
 */
public class News {
    private int newsId;
    private String headline;
    private String description;
    private Date date;

    public News(String headline, String description, Date date) {
        this.headline = headline;
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", headline='" + headline + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
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
}

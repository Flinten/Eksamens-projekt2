package com.example.demo.Utilities;

/**
 * Created by Ejer on 11-05-2018.
 */
public class FleaMarket {
    private int fleaMarketID;
    private String name;
    private String description;
    private double price;
    private String imagePath;


    public FleaMarket() {
    }

    public FleaMarket(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public FleaMarket(String name, String description, double price, String imagePath) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imagePath = imagePath;
    }

    public FleaMarket(int fleaMarketID, String name, String description, double price, String imagePath) {
        this.fleaMarketID = fleaMarketID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "FleaMarket{" +
                "fleaMarketID=" + fleaMarketID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }


    public int getFleaMarketID() {
        return fleaMarketID;
    }

    public void setFleaMarketID(int fleaMarketID) {
        this.fleaMarketID = fleaMarketID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}

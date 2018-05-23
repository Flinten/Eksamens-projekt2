package com.example.demo.Utilities;

/**
 * Created by Ejer on 11-05-2018.
 */
public class FleaMarket {
    private int fleaMarketId;
    private String name;
    private String description;
    private double price;

    public FleaMarket(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "FleaMarket{" +
                "fleaMarketId=" + fleaMarketId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public int getFleaMarketId() {
        return fleaMarketId;
    }

    public void setFleaMarketId(int fleaMarketId) {
        this.fleaMarketId = fleaMarketId;
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

    public void setPrice(double price) {
        this.price = price;
    }
}

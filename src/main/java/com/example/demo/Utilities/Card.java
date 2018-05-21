package com.example.demo.Utilities;

/**
 * Created by Ejer on 11-05-2018.
 */
public class Card {
    private int cardID;
    private String name;
    private String description;
    private double price;
    private String imagePath;

    public Card(){

    }

    public Card(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Card(String name, String description, double price, String imagePath) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imagePath = imagePath;
    }

    public Card(int cardID, String name, String description, double price, String imagePath) {
        this.cardID = cardID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardID=" + cardID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

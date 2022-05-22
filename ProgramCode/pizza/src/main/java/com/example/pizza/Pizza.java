package com.example.pizza;


import java.text.NumberFormat;

public class Pizza {
    private final String ingredients;
    private final String sauce;
    private final String vegetable;
    private final String cheese;
    private final String crust;
    private final String size;
    private final int numOfPizza;
    private double price;


    public Pizza(String ingredients,String sauce, String vegetable,  String cheese, String crust, String size, int numOfPizza) {
        this.ingredients = ingredients;
        this.sauce = sauce;
        this.vegetable = vegetable;
        this.cheese = cheese;
        this.crust = crust;
        this.size = size;
        this.numOfPizza = numOfPizza;
    }

    public String getIngredients() {
        return this.ingredients;
    }
    public String getVegetable() {
        return this.vegetable;
    }
    public String getCheese() {
        return this.cheese;
    }
    public String getCrust() {
        return this.crust;
    }
    public String getSize() {
        return this.size;
    }
    public int getNumOfPizza() {
        return this.numOfPizza;
    }
    public String getPrice() {
        if (size.equals("Large")) {
            this.price = 15.99;
        }
        else if (size.equals("Medium")) {
            this.price = 8.99;
        }
        else {
            this.price = 4.99;
        }
        NumberFormat priceOutput = NumberFormat.getCurrencyInstance();
        return priceOutput.format(this.numOfPizza * this.price);
    }
}

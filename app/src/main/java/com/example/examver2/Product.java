package com.example.examver2;

public class Product {
    String name, unit;
    double price;
    int amount = 0;
    double totalPrice;

    public Product(String name, String unit, double price){
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public void addAmount(int amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "name: " + this.name + ",\t price: " + this.price + ", \t unit: " + this.unit + ", \t amount: " + this.amount + ", \t total price: " + this.totalPrice + " \n" ;
    }

    public String toStringWithoutAmount(){
        return "name: " + this.name + ",\t price: " + this.price + ", \t unit: " + this.unit ;
    }




}
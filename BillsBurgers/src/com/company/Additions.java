package com.company;

public class Additions {

    private String name;
    private double price;

    public Additions(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Additions(){
        this.name = "DefaultName";
        this.price = 10000;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

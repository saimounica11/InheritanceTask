package com.stackroute.Inheritance;

public class HondaCity extends Car {
    String color;
    float price;
    public HondaCity(String color,float price) {
        this.color = color;
        this.price = price;
    }
    public void chagingGear(){
        System.out.println("I can change speed automatically");
    }
}

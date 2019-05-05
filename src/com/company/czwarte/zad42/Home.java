package com.company.czwarte.zad42;

import java.io.Serializable;
import java.util.ArrayList;

public class Home implements Serializable {

    private String name;
    private int cond;
    private double price;

    public Home() {
    }

    public Home(String name, int cond, double price) {
        this.name = name;
        this.cond = cond;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCond() {
        return cond;
    }

    public void setCond(int cond) {
        this.cond = cond;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Home> init(){
        ArrayList<Home> list = new ArrayList<Home>();
        Home home1 = new Home("Maly domek", 1, 17000.00);
        Home home2 = new Home("Sredni domek", 3, 1840000.00);
        Home home3 = new Home("Kamienica domek", 6, 9000000.00);
        list.add(home1);
        list.add(home2);
        list.add(home3);
        return list;
    }
}

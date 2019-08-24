package com.wdhcr.po;
/*
* 这是商品的实体类
* */
public class Goods {
    private int id;
    private String name;
    private String type;
    private double price;
    private int number;

    public Goods() {
    }

    public Goods(int id, String name, String type, double price, int number) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.number = number;
    }

    public Goods(String name, String type, double price, int number) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

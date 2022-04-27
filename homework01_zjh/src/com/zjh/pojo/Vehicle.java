package com.zjh.pojo;

public class Vehicle {
    //名称
    private String name;
    //速度
    private double speed;
    //价格
    private double price;

    public Vehicle() {
    }

    public Vehicle(String name, double speed, double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }
    //涨价
    public void risePrice(double add){
        this.price += add;
    }
    //降价
    public void cutPrice(double subtract){
        this.price -= subtract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称：" + name +" 速度：" + speed +" 价格：" + price ;
    }
}

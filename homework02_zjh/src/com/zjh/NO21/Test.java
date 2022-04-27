package com.zjh.NO21;

public class Test extends Student implements Criticism,Praise{
    @Override
    public void reducePoints(int point) {
        System.out.println("扣了"+point+"分");
    }

    @Override
    public void reduceMoney(double money) {
        System.out.println("扣了"+money+"元");
    }

    @Override
    public void addPoints(int point) {
        System.out.println("加了"+point+"分");
    }

    @Override
    public void addMoney(double money) {
        System.out.println("奖了"+money+"元");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.addMoney(100);
        test.reduceMoney(555.55);
        test.addPoints(66);
        test.reducePoints(1235);
    }
}

package com.zjh.pojo;

public class Rectangle {
    //高度
    private int height;
    //宽度
    private int width;
    //有参构造
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    //求面积
    public int getArea(){
        return this.height * this.width;
    }
    //求周长
    public int getPerimeter(){
        return (this.height + this.width) * 2;
    }
    //画出矩形
    public void Draw(){
        //上
        for (int i = 0; i < this.width; i++) {
            System.out.print("* ");
        }
        System.out.println();
        //左右
        for (int i = 0; i < this.height - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < this.width - 2; j++) {
                System.out.print("  ");
            }
            System.out.println(" *");
        }
        //下
        for (int i = 0; i < this.width; i++) {
            System.out.print("* ");
        }
    }
}

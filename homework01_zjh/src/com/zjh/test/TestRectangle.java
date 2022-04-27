package com.zjh.test;

import com.zjh.pojo.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        rectangle.Draw();
    }
}

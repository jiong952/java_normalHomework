package com.zjh.NO19;

public class Test19 {
    public static void main(String[] args) {
        //同一包可以访问public、protected、default
        Test test = new Test();
        System.out.println(test.public_name);
        System.out.println(test.protected_name);
        System.out.println(test.default_name);
        //无法访问private对象
    }
}

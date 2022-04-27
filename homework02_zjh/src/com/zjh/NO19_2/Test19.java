package com.zjh.NO19_2;

import com.zjh.NO19.Test;

public class Test19 {
    public static void main(String[] args) {
        //不同包 只可以访问public
        Test test = new Test();
        System.out.println(test.public_name);
        //无法调用protected对象
        //无法调用default对象
        //无法调研private对象
    }
}

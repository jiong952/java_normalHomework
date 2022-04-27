package com.zjh.test;

import com.zjh.pojo.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person man = new Person("张三", 23, 1, null);
        Person woman = new Person("小花", 20, 2, null);
        man.marry(woman);
        System.out.println(man);
    }
}

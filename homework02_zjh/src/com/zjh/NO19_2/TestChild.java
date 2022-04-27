package com.zjh.NO19_2;

import com.zjh.NO19.Test;

public class TestChild extends Test {
    public TestChild() {
    }

    public TestChild(String public_name, String protected_name, String default_name, String private_name) {
        super(public_name, protected_name, default_name, private_name);
    }

    public void test() {
        //不同包但是是子类，可以访问父类对象的public，和父类的public、protected
        Test test = new Test();
        System.out.println(test.public_name);
        System.out.println(super.protected_name);
        System.out.println(super.public_name);
    }
}

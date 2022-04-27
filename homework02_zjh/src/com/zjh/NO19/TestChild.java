package com.zjh.NO19;

public class TestChild extends Test{
    public TestChild() {
    }

    public TestChild(String public_name, String protected_name, String default_name, String private_name) {
        super(public_name, protected_name, default_name, private_name);
    }

    public void test() {
        //同一包可以访问public、protected、default
        Test test = new Test();
        System.out.println(test.public_name);
        System.out.println(test.protected_name);
        System.out.println(test.default_name);
    }
}

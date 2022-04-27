package com.zjh.NO19;

public class Test {
    public String public_name;
    protected String protected_name;
    String default_name;
    private String private_name;

    public Test() {
    }

    public Test(String public_name, String protected_name, String default_name, String private_name) {
        this.public_name = public_name;
        this.protected_name = protected_name;
        this.default_name = default_name;
        this.private_name = private_name;
    }
}

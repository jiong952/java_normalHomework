package com.zjh.NO17;

public class TestStudent {
    public static void main(String[] args) {
        Undergraduate undergraduate = new Undergraduate("3120005043","张俊鸿",99,1);
        undergraduate.calScholarship();
        Postgraduate postgraduate = new Postgraduate("3120008888", "洪俊章", 66, 10);
        postgraduate.calScholarship();
    }
}

package com.zjh.test;

import com.zjh.pojo.Book;

public class TestBook {
    public static void main(String[] args) {
//        Book book = new Book();
//        book.setBook("西游记","吴承恩",100);
        Book book = new Book("西游记", "吴承恩", 100);
        book.printBook();
    }
}

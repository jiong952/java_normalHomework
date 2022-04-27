package com.zjh.pojo;

public class Book {
    //书名
    private String bookName;
    //作者
    private String author;
    //月销量
    private int monthSale;
    //无参构造
    public Book() {
    }
    //有参构造
    public Book(String bookName, String author, int monthSale) {
        this.bookName = bookName;
        this.author = author;
        this.monthSale = monthSale;
    }
    //设置属性
    public void setBook(String bookName, String author, int monthSale){
        this.bookName = bookName;
        this.author = author;
        this.monthSale = monthSale;
    }
    //获取属性
    public void printBook() {
        System.out.println("书名：" + bookName+" 作者：" + author +" 月销量：" + monthSale);
    }
}

package com.zjh.NO17lambda;

public class TestStudent {
    public static void main(String[] args) {
        Undergraduate undergraduate = new Undergraduate("3120005043", "张俊鸿", 99, 1, rank -> {
            if (rank <= 5) {
                System.out.println("获得一等奖");
            } else if (rank <= 10) {
                System.out.println("获得二等奖");
            } else if (rank <= 20) {
                System.out.println("获得三等奖");
            } else {
                System.out.println("未获得奖学金");
            }
        });
        undergraduate.calScholarship();
        Postgraduate postgraduate = new Postgraduate("3120008888", "洪俊章", 66, 10, rank -> {
            if (rank <= 3) {
                System.out.println("获得一等奖");
            } else if (rank <= 8) {
                System.out.println("获得二等奖");
            } else if (rank <= 15) {
                System.out.println("获得三等奖");
            } else {
                System.out.println("未获得奖学金");
            }
        });
        postgraduate.calScholarship();
    }
}

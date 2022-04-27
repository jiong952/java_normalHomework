package com.zjh.NO17reference;

public class Student {
    public Student(String studentNum, String name, double avgGrade, int rank) {
        this.studentNum = studentNum;
        this.name = name;
        this.avgGrade = avgGrade;
        this.rank = rank;
    }

    public Student() {
    }

    //学号
    String studentNum;
    //姓名
    String name;
    //平均成绩
    double avgGrade;
    //排名
    int rank;
    //计算本科生奖学金的方法
    public void calUnderScholarship(int rank) {
        if(rank <= 5){
            System.out.println("获得一等奖");
        }else if(rank <= 10){
            System.out.println("获得二等奖");
        }else if(rank <= 20){
            System.out.println("获得三等奖");
        }else {
            System.out.println("未获得奖学金");
        }
    }
    //计算研究生奖学金的方法
    public void calPostScholarship(int rank) {
        if(rank <= 3){
            System.out.println("获得一等奖");
        }else if(rank <= 8){
            System.out.println("获得二等奖");
        }else if(rank <= 15){
            System.out.println("获得三等奖");
        }else {
            System.out.println("未获得奖学金");
        }
    }

}

package com.zjh.NO21;

public class Student {
    //学号
    String studentNum;
    //姓名
    String name;
    //平均成绩
    double avgGrade;
    //排名
    int rank;

    public Student(String studentNum, String name, double avgGrade, int rank) {
        this.studentNum = studentNum;
        this.name = name;
        this.avgGrade = avgGrade;
        this.rank = rank;
    }

    public Student() {
    }
}

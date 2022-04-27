package com.zjh.NO17;

public abstract class Student {
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
    //计算奖学金的方法
    public abstract void calScholarship();
}

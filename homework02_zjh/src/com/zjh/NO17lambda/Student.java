package com.zjh.NO17lambda;

public abstract class Student {
    Scholarship scholarship;
    public Student(Scholarship scholarship,String studentNum, String name, double avgGrade, int rank) {
        this.scholarship = scholarship;
        this.studentNum = studentNum;
        this.name = name;
        this.avgGrade = avgGrade;
        this.rank = rank;
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

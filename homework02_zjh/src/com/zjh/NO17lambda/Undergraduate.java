package com.zjh.NO17lambda;

public class Undergraduate extends Student{
    public Undergraduate(String studentNum, String name, double avgGrade, int rank, Scholarship scholarship) {
        super(scholarship,studentNum, name, avgGrade, rank);
    }


    @Override
    public void calScholarship() {
        this.scholarship.calScholarship(this.rank);
    }
}

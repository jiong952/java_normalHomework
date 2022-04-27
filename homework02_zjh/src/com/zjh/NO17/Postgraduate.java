package com.zjh.NO17;

public class Postgraduate extends Student{
    //研究生
    public Postgraduate(String studentNum, String name, double avgGrade, int rank) {
        super(studentNum, name, avgGrade, rank);
    }

    public Postgraduate() {
    }

    @Override
    public void calScholarship() {
        if(this.rank <= 3){
            System.out.println("获得一等奖");
        }else if(this.rank <= 8){
            System.out.println("获得二等奖");
        }else if(this.rank <= 15){
            System.out.println("获得三等奖");
        }else {
            System.out.println("未获得奖学金");
        }
    }
}

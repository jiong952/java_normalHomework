package com.zjh.NO17;

public class Undergraduate extends Student{
    //本科生
    public Undergraduate() {
    }
    public Undergraduate(String studentNum, String name, double avgGrade, int rank) {
        super(studentNum, name, avgGrade, rank);
    }

    @Override
    public void calScholarship() {
        if(this.rank <= 5){
            System.out.println("获得一等奖");
        }else if(this.rank <= 10){
            System.out.println("获得二等奖");
        }else if(this.rank <= 20){
            System.out.println("获得三等奖");
        }else {
            System.out.println("未获得奖学金");
        }
    }

}

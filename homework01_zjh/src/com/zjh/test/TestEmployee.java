package com.zjh.test;

import com.zjh.pojo.Employee;
import com.zjh.pojo.HireDate;

public class TestEmployee {
    public static void main (String[] args) {
        Employee[] e = new Employee[3];
        e[0] = new Employee("张三",new HireDate(2020,10,1),"秘书部",8762);
        e[1] = new Employee("李四",new HireDate(2021,8,8),"项目部",6666);
        e[2] = new Employee("王五",new HireDate(2022,1,1),"管理部",5555);

        System.out.println(e[0].getName());
        System.out.println(e[0].getHireDate());
        System.out.println(e[0].getHireDate().getYear());
        System.out.println(e[1].getSalary());
        System.out.println(e[2].getDepartment());
    }
}

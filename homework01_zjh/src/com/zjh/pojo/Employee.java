package com.zjh.pojo;

public class Employee {
    //姓名
    private String name;
    //入职时间
    private HireDate hireDate;
    //部门
    private String department;
    //工资
    private double salary;

    public Employee(String name, HireDate hireDate, String department, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HireDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "姓名：" + name +" 入职时间=" + hireDate +" 部门：" + department +" 工资：" + salary;
    }
}

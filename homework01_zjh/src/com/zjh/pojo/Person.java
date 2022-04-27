package com.zjh.pojo;

public class Person {
    //姓名
    private String name;
    //年龄
    private int age;
    //性别 0:空 1:男 2:女
    private int gender = 0;
    //配偶
    private String partner= "";

    public Person(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age, int gender, String partner) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.partner = partner;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "姓名：" + name + " 年龄：" + age + " 性别：" + ((gender == 1)? "男" :"女") + " 配偶：" + partner;
    }

    //结婚方法
    public boolean marry(Person p){
        //异性 单身 适婚年龄(男22 女20)
        //异性 单身
        if(this.gender != p.gender){
            if(this.partner == null && p.partner == null){
                //判断性别
                //男 22 另一个女20
                //女 20 另一个男22
                if((this.gender == 1 && this.age >= 22 && p.age >=20)||(this.gender == 2 && this.age >= 20 && p.age >=22)){
                    this.partner = p.name;
                    p.partner = this.name;
                    System.out.println("结婚成功");
                    return true;
                }else {
                    System.out.println("未达到适婚年龄");
                }
            }else {
                System.out.println("不是都单身");
            }
        }else {
            System.out.println("不是异性！");
        }
        return false;
    }
}

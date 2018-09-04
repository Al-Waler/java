package com.Jsample;

import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    //static int tt;
    //Employee 构造器
    public Employee(String name) {
        this.name = name;
        //tt=122;
    }
    public void empAge(int empAge) {
        this.age = empAge;
    }
    public void empDesignation(String empDsig) {
        designation = empDsig;
    }
    public void empSalary(double empSalary) {
        salary = empSalary;
    }
    /* 打印信息 */
    public void printEmployee() {
        System.out.println("名字:"+ name );
        System.out.println("年龄:" + age );
        System.out.println("职位:" + designation );
        System.out.println("薪水:" + salary);
    }
}

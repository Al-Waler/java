package com.Jsample;

import com.runoob.test.Logger;

import java.io.*;

public class EmployeeTest {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        //自动类型转换
        //byte,char,short->int->long->float->double
        String mk = "mike";
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        Logger log = new Logger();
        log.setFormat("dddd");
        System.out.println(log.getFormat());

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(PI);
        empOne.printEmployee();

        empTwo.empAge(22);
        empTwo.empDesignation("初级程序员");
        empTwo.empSalary(200);
        empTwo.printEmployee();
        //System.out.println(Employee.tt);
        char c1='A';
        int i1 = c1;
        System.out.println(i1);
        int i2 = 127;
        byte b = (byte)i2;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+b);
        /*基类的 protected 成员是包内可见的，并且对子类可见；
        若子类与基类不在同一包中，那么在子类中，子类实例可以访
        问其从基类继承而来的protected方法，而不能访问基类实例的protected方法。*/

    }
}

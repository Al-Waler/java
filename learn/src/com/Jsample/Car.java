package com.Jsample;

class Vehicle {}

public class Car extends Vehicle {
    public static void main(String args[]){
//        子类实例可以声明父类类型，父类类型声明子类实例
        Car c1 = new Car();

        Vehicle v2 = new Car();    // v2 是 Car 类型
        Vehicle v3 = new Vehicle();

        //Car 是 Vehicle类型, Vehicle 不是 Car 类型
        boolean result1 =  c1 instanceof Vehicle;    // true
        boolean result2 =  v2 instanceof Car;        // true
        boolean result3 =  v2 instanceof Vehicle;    // true
        boolean result4 =  v3 instanceof Car;          // false

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


    }
}

package com.runoob.test;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("next 方式接收数据");
        /*if (scanner.hasNext()) {
            String str1 = scanner.nextLine();//x = next()
            System.out.println("输入数据"+str1);
        }*/
        double sum = 0;
        int m = 0;
        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
            m++;
        }
        System.out.println(sum);
        System.out.println(m);
        scanner.close();
    }
}


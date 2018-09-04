package com.runoob.test;

import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
        //读取控制台输入
        //char c;
        String str;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        do {
            //读取字符
            //c = (char) br.read();
            //System.out.println(c);
            //读取字符串
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));
    }
}

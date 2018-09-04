package com.runoob.test;

import com.Jsample.Dog;
import com.Jsample.Employee;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Arrays;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.SimpleTimeZone;

class Test extends Dog {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT =
            "cat cat cat cattie cat";
    String aa = "ddd";
    public void empAge(){
        System.out.println(this.aa);
    }
    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int [] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }
        Integer[] numbers = {10,20,30,40,50};
        printArray(numbers);
        int[] numbers2 = new int[]{};
        numbers[0] = 12;
        printArray(numbers2);
        for (int x:numbers) {
            if (x==20) {
                break;
            }
            System.out.println(x);
        }
        String [] names = {"dd","cc","vv","xx"};
        for (String g:names) {
            System.out.println(g);
        }
        //Number && Math类
        //=变量地址  equals 变量内容 Java 会对 -128 ~ 127 的整数进行缓存，所以当定义两个变量初始化值位于 -128 ~ 127 之间时，两个变量使用了同一地址
        Integer i1=1230;
        Integer i2=1230;
        if (i1.equals(i2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        Character[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
        //System.out.println(charArray);
        //java数组
        //声明数组变量dataType[] arrayRefVar
        //声明并创建数组 @1 dataType[] arrayRefVar = new dataType[arraySize]
        //@2 dataType[] arrayRefVar = {}
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        /*System.out.println("-------------");
        for (int i=0;i<myList.length;i++) {
            System.out.println(myList[i]);
        }*/

        double total = 0;
        for (int i = 0;i < myList.length;i++) {
            total+=myList[i];
        }
        System.out.println(total);
        //foreach
        for (double x:myList) {
            System.out.println(x);
        }
        int[] test = {1,2,3,4,5};
        //Test.printArray(test);
        //数组作为函数返回值
        int[] tt = Test.reverse(test);
        for (int x:tt) {
           // System.out.println(x);
        }
        //System.out.print(tt);
        //String s[][] = new String[][];
        int key = Arrays.binarySearch(test,5);
        System.out.print(key);
        boolean res = Arrays.equals(tt,test);
        if (res) {
            System.out.println("==");
        } else {
            System.out.println("!=");
        }
        //Arrays.fill(tt,4);
        Arrays.sort(tt);
        for (int x:tt) {
             System.out.println(x);
        }
        //java 日期 格式化
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(ft.format(date));

        //使用printf格式化日期
        System.out.println(date);
        System.out.println("\n");
        System.out.println(date.getTime());

        try {
            System.out.println(new Date()+"\n");
            Thread.sleep(1*1000);//休眠毫秒
            System.out.println(new Date()+"\n");
        }catch (Exception e) {
            System.out.println("error======");
        }

        try {
            long start = System.currentTimeMillis();
            Thread.sleep(1*1000);
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println(diff);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Calendar类
        Calendar c = Calendar.getInstance();
        //c.set(Calendar.YEAR,1999);
        c.add(Calendar.DATE,10);
        String d = ft.format(c.getTime());
        System.out.println(d);

        //java 正则表达式
        String content = "IM noob"+"from runoob.com";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println(isMatch);
        if (isMatch) {
            System.out.println("=====");
        }

        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern1 = "(\\D*)(\\d+)(.*)";

        //创建Pattern对象
        Pattern r = Pattern.compile(pattern1);

        //现在创建matcher对象
        Matcher m = r.matcher(line);
        System.out.println(m.groupCount());
        if (m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        } else {
            System.out.println("NO MATCH");
        }

        Pattern p = Pattern.compile(REGEX);
        Matcher t = p.matcher(INPUT); // 获取 matcher 对象
        int count = 0;
        //System.out.println(t.find());
        while(t.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+t.start());
            System.out.println("end(): "+t.end());
        }

        System.out.println("========可变参数=============");
        printMax(2,3,4,5,7,8.9);
        printMax(new double[]{1,2,3});

    }

    public static void printMax(double ...numbers) {
        if (numbers.length == 0) {
            return;
        }
        double result  = numbers[0];
        for (int i=0;i<numbers.length;i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println(result);
    }
}


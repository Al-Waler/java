package com.runoob.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FinalizationDemo {
    /*  finalize() 方法
        Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象。

        例如，你可以使用 finalize() 来确保一个对象打开的文件被关闭了。

        在 finalize() 方法里，你必须指定在对象销毁时候要执行的操作。

        finalize() 一般格式是：

        protected void finalize()
        {
           // 在这里终结代码
        }
    */
    public static void main(String[] args) {
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        c1=c2=c3=null;
        System.gc();
    }
}

class Cake extends Object {
    private int id;
    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + "is created");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake Object " + id + "is disposed");
    }
}
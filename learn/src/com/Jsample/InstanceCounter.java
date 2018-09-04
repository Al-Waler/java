package com.Jsample;

public class InstanceCounter {
    private static int numInstance = 0;
    protected static int getCount() {
        return numInstance;
    }
    private static void addInstance() {
        numInstance++;
    }
    public InstanceCounter() {
        //对类变量和方法的访问可以直接使用 classname.variablename 和 classname.methodname 的方式访问。
        InstanceCounter.addInstance();
    }
    public static void main(String[] args) {
        System.out.println("Starting with " +
                InstanceCounter.getCount() + " instances");
        for (int i=0;i<500;i++) {
            new InstanceCounter();
        }
        System.out.println("Created " +
                InstanceCounter.getCount() + " instances");
    }
}

package com.runoob.test;

import java.io.*;

public class FileStreamTest2 {
    public static void main(String[] args) throws IOException{
        File f = new File("a.txt");
        //构建FileOutputStream 对象文件不存在会自动创建
        FileOutputStream fop = new FileOutputStream(f);
        //构建OutputStream 对象 参数可指定编码
        OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");
        //写入到缓冲区
        writer.append("中文输入");
        //换行
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        //关闭输出流释放系统资源
        fop.close();

        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip,"UTF-8");

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();

        //java 目录
        String dir = "D:/ll/tests/test";
        File d = new File(dir);
        d.mkdirs();
        FileOutputStream op = new FileOutputStream(dir+"/"+"a.txt");
        String dirname = "D:/ll";
        loopDir(dirname);
        String delDirName = "D:/ll/tests/test.tst";
        delDir(delDirName);
    }

    protected static void loopDir(String dirname) {
        //list()返回某个目录下的所有文件和目录的文件名  listFiles()返回某个目录下所有文件和目录的绝对路径

        File ff = new File(dirname);
        if (ff.isDirectory()) {
            System.out.println("目录"+dirname);
            String s[] = ff.list();
            for (int i=0;i<s.length;i++) {
                File fof = new File(dirname + "/" + s[i]);
                if (fof.isDirectory()) {
                    loopDir(dirname+"/"+s[i]);
                } else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        } else {
            System.out.println(dirname+"不是一个目录");
        }
    }

    protected static void delDir(String dirname) {
        File folder = new File(dirname);
        folder.delete();
    }
}

package com.runoob.test;

import java.io.*;

public class MusicCompound {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        String fileNames[] = {"D:/示例歌曲/ddd.mp3","D:/示例歌曲/eee.mp3"};
        //设置byte数组 每次往输出传入8k
        byte by[] = new byte[8*1024];
        try {
            fileOutputStream = new FileOutputStream("D:/示例歌曲/oop.mp3");
            for (int i=0;i<2;i++) {
                int count = 0;
                fileInputStream =new FileInputStream(fileNames[i]);
                fileInputStream.skip(3*1024*1024);
                while (fileInputStream.read(by) != -1) {
                    fileOutputStream.write(by);
                    count++;
                    if (count==(1024*2/8)) {
                        break;
                    }
                }
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

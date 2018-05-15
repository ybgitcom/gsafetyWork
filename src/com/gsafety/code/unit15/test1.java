package com.gsafety.code.unit15;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class test1 {
    /**
     * 题目：读取文件，出现进度条
     *
     * 知识点：FileInputStream类的使用，第十三章Swing知识点应用
     *
     * 思路：通过FileInputStream读取文本文件，ProgressMonitorInputStream类通过计时器实现进度更新
     *
     */
    public static void main(String[] args) {
        File file = new File("word.txt"); // 创建文件对象
        try { // 捕捉异常
            // 创建FileOutputStream对象
            FileOutputStream out = new FileOutputStream(file);
            // 创建byte型数组
            byte buy[] = "我有一只小毛驴，我从来也不骑。".getBytes();
            out.write(buy); // 将数组中信息写入到文件中
            out.close(); // 将流关闭
        } catch (Exception e) { // catch语句处理异常信息
            e.printStackTrace(); // 输出异常信息
        }

        byte b[] = new byte[2];
        try{
            FileInputStream fis = new FileInputStream("word.txt");
            ProgressMonitorInputStream in =
                    new ProgressMonitorInputStream(null,"读取文件",fis);
            while(in.read(b)!=-1){
                String s = new String(b);
                System.out.print(s);
                Thread.sleep(100);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

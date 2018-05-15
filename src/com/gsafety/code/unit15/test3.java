package com.gsafety.code.unit15;

import java.io.FileOutputStream;
import java.io.IOException;

public class test3 {
    /**
     * 题目：实现输入姓名，密码存入文件中，输入done结束
     *
     * 知识点：
     */
    static final int lineLength = 81;

    public static void main(String[] args) {
        FileOutputStream fos;

        byte[] phone = new byte[lineLength];
        byte[] name = new byte[lineLength];
        try {
            fos = new FileOutputStream("word.txt");
            while (true) {
                System.err.println("请输入一个名字：");
                if ("done".equalsIgnoreCase(new String(name, 0, 0, 4))) {
                    System.out.println("录入完毕");
                    break;
                }
                System.err.println("请输入电话号：");
                readLine(phone);
                for (int i = 0; phone[i] != 0; i++) {
                    fos.write(phone[i]);
                }
                fos.write(',');
                for (int j = 0; name[j] != 0; j++) {
                    fos.write(name[j]);
                }
                fos.write('\n');
                System.out.println("信息已经写入文件");
            }
            fos.close();
        } catch (Exception e) {
            // TODO 自动生成 catch 块
            e.printStackTrace();
        }
    }

    private static void readLine(byte[] name) throws IOException {
        int b = 0, i = 0;
        while ((i < (lineLength - 1)) && (b = System.in.read()) != '\n') {
            name[i++] = (byte) b;
        }
        name[i] = (byte) 0;
    }
}

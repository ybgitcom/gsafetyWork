package com.gsafety.code.unit15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class test2 {
    /**
     * 题目：输入文字实现输入输出，加密，然后再读取文字
     *
     * 知识点：FieldWriter、FileReader使用；文件加密
     *
     */
    public static void main(String[] args) {
        char a[] = "我有一只小毛驴，从来也不骑！".toCharArray();
        int n = 0;
        try {
            File out = new File("word.txt");
            for (int i = 0; i < a.length; i++) {
                a[i] = (char) (a[i] ^ 'R');
            }
            FileWriter fw = new FileWriter(out);
            fw.write(a, 0, a.length);
            fw.close();
            FileReader fr = new FileReader(out);
            char tom[] = new char[10];
            System.out.println("加密后：");
            while ((n = fr.read(tom, 0, 10)) != -1) {
                String s = new String(tom, 0, n);
                System.out.println(s);
            }
            fr.close();
            fr = new FileReader(out);
            System.out.println("明文：");
            while ((n = fr.read(tom, 0, 10)) != -1) {
                for (int j = 0; j < n; j++) {
                    tom[j] = (char) (tom[j] ^ 'R');
                }
                String str = new String(tom, 0, n);
                System.out.println(str);
            }

            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

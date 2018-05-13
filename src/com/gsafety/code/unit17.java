package com.gsafety.code;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * created by yb
 * Date:2018/5/8
 */
//从键盘输入文件的内容和要保存的文件名称，之后根据输入的名称创建文件，并将内容保存到文件之中。
public class unit17 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String fileName = null; // 保存文件名称
        String fileContent = null; // 保存文件内容
        System.out.print("请输入 文件名 称： "); // 提示信息
        scan.useDelimiter("\n"); // 设置分隔符
        if (scan.hasNext()) { // 有输入内容
            fileName = scan.next().trim(); // 接收数据
            System.out.print("请输入文件内容： ");
            if (scan.hasNext()) {
                fileContent = scan.next().trim(); // 接收数据
                File file = new File(fileName);
                if (!file.getParentFile().exists()) { // 文件目录不存在
                    file.getParentFile().mkdirs(); // 创建目录
                }
                PrintStream out = new PrintStream(new FileOutputStream(file));
                out.print(fileContent);
                out.close();
            }
        }
    }
}











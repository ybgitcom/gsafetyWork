package com.gsafety.code;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * created by yb
 * Date:2018/5/8
 */
//�Ӽ��������ļ������ݺ�Ҫ������ļ����ƣ�֮�������������ƴ����ļ����������ݱ��浽�ļ�֮�С�
public class unit17 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String fileName = null; // �����ļ�����
        String fileContent = null; // �����ļ�����
        System.out.print("������ �ļ��� �ƣ� "); // ��ʾ��Ϣ
        scan.useDelimiter("\n"); // ���÷ָ���
        if (scan.hasNext()) { // ����������
            fileName = scan.next().trim(); // ��������
            System.out.print("�������ļ����ݣ� ");
            if (scan.hasNext()) {
                fileContent = scan.next().trim(); // ��������
                File file = new File(fileName);
                if (!file.getParentFile().exists()) { // �ļ�Ŀ¼������
                    file.getParentFile().mkdirs(); // ����Ŀ¼
                }
                PrintStream out = new PrintStream(new FileOutputStream(file));
                out.print(fileContent);
                out.close();
            }
        }
    }
}











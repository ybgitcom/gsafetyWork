package com.test.code;

import java.util.Date;

/**
 * created by yb
 * Date:2018/5/8
 */
public class Demo44 {
    public static void main(String[] args) { // ������
        Date date = new Date(); // ����Date����date
        String year = String.format("%tY", date); // ��date���и�ʽ��
        String month = String.format("%tB", date);
        String day = String.format("%td", date);
        System.out.println("�����ǣ�" + year + "��"); // �����Ϣ
        System.out.println("�����ǣ�" + month);
        System.out.println("�����ǣ�" + day + "��");
    }
}












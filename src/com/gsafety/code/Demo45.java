package com.test.code;

import java.util.Date;

/**
 * created by yb
 * Date:2018/5/8
 */
public class Demo45 {
    public static void main(String[] args) { // ������
        Date date = new Date(); // ����Date����date
        String hour = String.format("%tH", date); // ��date���и�ʽ��
        String minute = String.format("%tM", date);
        String second = String.format("%tS", date);
        // �������Ϣ
        System.out.println("�����ǣ�" + hour + "ʱ" + minute + "��"
                + second + "��");
    }
}












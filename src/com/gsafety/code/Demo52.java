package com.test.code;

/**
 * created by yb
 * Date:2018/5/8
 */
public class Demo52 {
    public static void main(String[] args) { // ������
        String regex = "1[35]\\d{9}";
        String text = "15000000000";
        if (text.matches(regex)) {
            System.out.println(text + "�ǺϷ����ֻ���");
        }
    }
}











package com.test.code;

/**
 * created by yb
 * Date:2018/5/8
 */
public class Demo41 {
    public static void main(String args[]) { // ������
        String str = new String("b");
        String str2 = new String("a"); // ���ڱȽϵ�3���ַ���
        String str3 = new String("c");
        System.out.println(str + " compareTo " + str2 + ":"
                + str.compareTo(str2)); // ��str��str2�ȽϵĽ�����
        System.out.println(str + " compareTo " + str3 + ":"
                + str.compareTo(str3)); // ��str��str3�ȽϵĽ�����
    }
}












package com.gsafety.code.unit14;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    /**
     * ��Ŀ��List���ϲ���1-100������Ȼ��һ������λ��Ϊ10�Ķ���
     *
     * ֪ʶ�㣺��List����add()��remove()����ʹ��
     *
     * ˼·�������������ѭ��add,������ʵ��remove
     */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();//����List����
        System.out.println("List���ϲ���1-100������Ȼ��һ������λ��Ϊ10�Ķ���");
        int num=100;
        while (num-->0){
            list.add(num);
        }
        System.out.println("��ӡList�����ж���");
        for (int i = 0; i <list.size() ; i++) {
            System.out.printf(String.valueOf(list.get(i)));
            System.out.printf(";");
        }
        System.out.println("");
        //ɾ������λ��Ϊ10��Ԫ��
        list.remove(10);
        System.out.println("��ӡ����List�����ж���");
        for (int i = 0; i <list.size() ; i++) {
            System.out.printf(String.valueOf(list.get(i)));
            System.out.printf(";");
        }
    }

}

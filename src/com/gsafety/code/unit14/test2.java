package com.gsafety.code.unit14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test2 {
    /**
     * ��Ŀ��ʹ��Set���ϣ�List���ϣ��ֱ������ĸ���۲��ظ���ĸ���״̬
     *
     * ֪ʶ�㣺����Set���Ϻ�List���ϵ����ԣ�Set�����в�����Ԫ���ظ���List��������ظ�Ԫ��
     */
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        List<String> list=new ArrayList<>();
        System.out.println("Set���������ĸ��");
        set.add("A");
        set.add("a");
        set.add("A");
        set.add("c");
        set.add("c");
        System.out.println(set);
        System.out.println("-------------");
        System.out.println("List���������ĸ��");
        list.add("A");
        list.add("a");
        list.add("A");
        list.add("c");
        list.add("c");
        System.out.println(list);

    }
}

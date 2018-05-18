package com.gsafety.code.unit14;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    /**
     * 题目：List集合插入1-100整数，然后一处索引位置为10的对象
     *
     * 知识点：对List类中add()和remove()方法使用
     *
     * 思路：定义计数器，循环add,添加完成实现remove
     */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();//创建List对象
        System.out.println("List集合插入1-100整数，然后一处索引位置为10的对象");
        int num=100;
        while (num-->0){
            list.add(num);
        }
        System.out.println("打印List中所有对象：");
        for (int i = 0; i <list.size() ; i++) {
            System.out.printf(String.valueOf(list.get(i)));
            System.out.printf(";");
        }
        System.out.println("");
        //删除索引位置为10的元素
        list.remove(10);
        System.out.println("打印最新List中所有对象：");
        for (int i = 0; i <list.size() ; i++) {
            System.out.printf(String.valueOf(list.get(i)));
            System.out.printf(";");
        }
    }

}

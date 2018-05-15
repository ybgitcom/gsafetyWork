package com.gsafety.code.unit14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test2 {
    /**
     * 题目：使用Set集合，List集合，分别添加字母，观察重复字母添加状态
     *
     * 知识点：考察Set集合和List集合的特性；Set集合中不允许元素重复，List允许出现重复元素
     */
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        List<String> list=new ArrayList<>();
        System.out.println("Set集合添加字母：");
        set.add("A");
        set.add("a");
        set.add("A");
        set.add("c");
        set.add("c");
        System.out.println(set);
        System.out.println("-------------");
        System.out.println("List集合添加字母：");
        list.add("A");
        list.add("a");
        list.add("A");
        list.add("c");
        list.add("c");
        System.out.println(list);

    }
}

package com.gsafety.code.unit14;

import java.util.*;

public class test3 {
    /**
     * 题目：创建Map 集合，Emp对象，将Emp对象添加到Map集合中
     *
     * 知识点：Map集合key与Value映射关系，put(）方法使用
     */
    public static void main(String[] args) {
        Map<Integer,Emp> map=new HashMap<>();
        List<Emp> list=new ArrayList<>();
        list.add(new Emp("张三",15,001));
        list.add(new Emp("李四",12,002));
        list.add(new Emp("小红",10,003));
        list.add(new Emp("二哈",3,015));
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).id,list.get(i));//添加List集合中的Emp对象
        }
        for (int key : map.keySet()) {  //打印Map集合内容
            System.out.println(map.get(key));
        }
        //删除id="015"的元素
        System.out.println("----------");
        map.remove(015);
        Set<Integer> set=map.keySet();
        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
     }
}
class Emp{
    String name;
    int age;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Emp(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


}
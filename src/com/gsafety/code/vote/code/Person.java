package com.vote.code;

/**
 * created by yb
 * Date:2018//8
 */
public class Person implements Comparable<Person>{
    private String  name ;
    private int id ;
    private int count;
    public Person(){ super();
    }
    public Person(int id , String name,int count){
        super();
        this.name = name;
        this.id = id;
        this.count = count;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int compareTo(Person p){
        if(this.count>p.count){
            return -1;
        }else if(this.count<p.count){
            return 1;
        }else{
            return 0;
        }
    }
}

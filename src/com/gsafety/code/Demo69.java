package com.gsafety.code;



/**
 * created by yb
 * Date:2018/5/8
 */
public abstract class Demo69 {

    public void doSomething(){
        System.out.println("����.doSomething()");
    }
    public void doAnything(){
        System.out.println("����.doAnything()");
    }
    public static void main(String args[]){
       Demo69 u=new sub();
        u.doSomething();
        u.doAnything();
    }
}
class sub extends Demo69{
    public void doAnything(){
        System.out.println("����.doAnything()");
    }
}












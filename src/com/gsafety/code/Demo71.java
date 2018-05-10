package com.gsafety.code;


/**
 * created by yb
 * Date:2018/5/8
 */
public abstract class Demo71 {
}

class OuterClass4 {

    public OutInterface doit(final String s) {
        return new OutInterface() {
            private int i = 0;

            public int getValue() {
                System.out.println(s);
                return i;

            }

            public void f() {
                System.out.println("f()");
            }
        };
    }

}

interface OutInterface { // 定义一个接口
}










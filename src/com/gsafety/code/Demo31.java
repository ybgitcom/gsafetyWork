package com.test.code;

/**
 * created by yb
 * Date:2018/5/8
 */
public class Demo31 {
    public static void main(String args[])
    {
        double sum = 0,a = 1;
        int i = 1;
        while(i <= 20)
        {
            sum = sum+a;
            i = i+1;
            a = a*(1.0/i);
        }
        System.out.println(sum);
    }
}








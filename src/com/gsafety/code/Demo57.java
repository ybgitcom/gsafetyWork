package com.gsafety.code;

import java.util.Arrays;

/**
 * created by yb
 * Date:2018/5/8
 */
public class Demo57 {
    public static void main(String[] args) {
        String arr[] = new String[] { "ac", "dc", "yc" };
        System.out.println("Ìæ»»Ç°£º");
      for(String str : arr) {
            System.out.print(str+"\t");
        }
        Arrays.fill(arr, 2, 3, "bb");
        System.out.println("\nÌæ»»ºó£º");
        for (String str2 : arr) {
            System.out.print(str2+"\t");
        }
    }
}











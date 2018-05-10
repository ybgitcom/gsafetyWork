package com.test.code;

/**
 * created by yb
 * Date:2018/5/8
 */
public class Demo20 {
    public static void main(String args[]) {
        int x = 20;
        {
            int y = 40;
            System.out.println(y);
            int z = 245;
            boolean b;
            {
                b = y > z;
                System.out.println(b); // ∏¥∫œ”Ôæ‰
            }
        }
        String word = "hello java";
        System.out.println(word);
    }
}









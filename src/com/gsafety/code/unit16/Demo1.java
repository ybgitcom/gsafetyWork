package com.gsafety.code.unit16;

import java.lang.reflect.Array;
    /**
     * 题目：反射实现扩展数组长度
     */
public class Demo1 {
    public static void main(String[] args) {
        Test test = new Test();
        test.print();
        test.is = (int[]) addArrayLength(test.is, 10);//调用扩展方法addArrayLength
        test.print();
    }

    public static Object addArrayLength(Object array, int newLength) { //数据扩展
        Object newArray = null;
        Class componentType = array.getClass().getComponentType(); //取得一个数组的Class对象
        newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(array, 0, newArray, 0, Array.getLength(array));
        return newArray;
    }
}

class Test {
    public int[] is = { 1, 2, 3 };
    public void print() {
        for (int index = 0; index < is.length; index++) {//遍历数组元素
            System.out.println("is[" + index + "]=" + is[index]);
        }
        System.out.println();   //打印数组

    }

}

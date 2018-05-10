package com.gsafety.code;

/**
 * created by yb
 * Date:2018/5/8
 */
public class Demo61   {

    private float height;
    private float width;
    public Demo61(float height,float width){
        this.height=height;
        this.width=width;
    }
    public float square(){
        return height*width;
    }
    public static void main(String args[]){
        Demo61 u=new Demo61(3.5f,5.5f);
        System.out.println(u.square());
    }
}












package com.gsafety.code;

import java.text.DecimalFormat;

/**
 * created by yb
 * Date:2018/5/8
 */
public class Demo67 {

    static public void SimpleFormat(String pattern, double value) {	//ʹ��ʵ��������ʱ���ø�ʽ��ģʽ
        DecimalFormat myFormat = new DecimalFormat(pattern);	//ʵ����DecimalFormat����
        String output = myFormat.format(value);				//�����ֽ��и�ʽ��
        System.out.println(value + " " + pattern + " " + output);
    }
    public static double GetRoundArea(double r){
        return Math.PI*Math.pow(r, 2);
    }
    public static void main(String[] args) {
        System.out.print("Բ�����Ϊ��");
        SimpleFormat("#.#####",GetRoundArea(4));
    }

}










package com.gsafety.code;

public class Demo85   {

	enum Constants2 { // ������������ö��������
		Constants_A, Constants_B
	}
	// ����һ������������Ĳ���Ϊö�����Ͷ���
	public static void doit2(Constants2 c) {
		switch (c) { // ����ö�����Ͷ�������ͬ����
			case Constants_A:
				System.out.println("doit2() Constants_A");
				break;
			case Constants_B:
				System.out.println("doit2() Constants_B");
				break;
		}
	}

	public static void main(String[] args) {
		Demo85.doit2(Constants2.Constants_A);
		Demo85.doit2(Constants2.Constants_B);
	}
}

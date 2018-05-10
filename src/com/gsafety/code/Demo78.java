package com.gsafety.code;

import java.util.LinkedList;
import java.util.List;

public class Demo78 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		for(int i = 1 ;i<=100;i++){
			list.add(new Integer(i));
		}
		list.remove(list.get(10));
		System.out.println("ok");
	}
}


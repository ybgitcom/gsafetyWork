package com.gsafety.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo79 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();  //HashSet是Set的子接口
		set.add("a");
		set.add("c");
		set.add("A");
		set.add("a");
		set.add("C");
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("A");
		list.add("a");
		list.add("C");
		System.out.println(set);
		System.out.println(list);
	}
}


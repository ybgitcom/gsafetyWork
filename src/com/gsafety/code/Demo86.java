package com.gsafety.code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo86<T extends List> {

	
	public static void main(String[] args) {
		Demo86<ArrayList> l1 = new Demo86<ArrayList>();
		Demo86<LinkedList> l2 = new Demo86<LinkedList>();
		// LimitClass<HashMap> l3=new LimitClass<HashMap>();
	}

}

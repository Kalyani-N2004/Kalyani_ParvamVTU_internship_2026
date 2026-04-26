package com.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(2);
		al.add(20);
		al.add(12);
		al.add(23);
		al.add(8);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println("Min: " +Collections.min(al));
		System.out.println("Max: " +Collections.max(al));
		System.out.println("Binary :" +Collections.binarySearch(al,20));
		//linkedlist,Arrays-utilityclass
	}

}

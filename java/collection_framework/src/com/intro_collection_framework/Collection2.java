package com.intro_collection_framework;
 
import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
	public static void main (String[] args) {
		Collection c1 = new ArrayList();// this is an interface so here we not create any object //upcasting//no type safetyand need to type casting
		c1.add("pavan");
		c1.add(12);
		c1.add(true);
		System.out.println(c1);
		
		Collection c2 = new ArrayList();
		c2.add("hello");
		
		c1.addAll(c2);
		
		System.out.println(c1);
	}
}

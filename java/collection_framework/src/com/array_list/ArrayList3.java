package com.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(2);
		al.add(20);
		al.add(12);
		al.add(23);
		al.add(8);
		System.out.println(al);
		
		//for-loop(index based)
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
			
		}
		//FOR each(enhanced)
		for(int ele:al) {
			System.out.print(ele+" ");
		}
		//for each
		al.forEach((ele)->System.out.print(ele+" "));//method
		
		
		System.out.println();//moves to the next line
		System.out.println("----------------------------");
		
		//iterator -unidirectional (forward)
		Iterator<Integer> itr =al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

		System.out.println();
		System.out.println("----------------------------");
		

		ListIterator<Integer> list =al.listIterator();
		while(itr.hasNext()) {
			System.out.print(list.next()+" ");
		}
	}


	}



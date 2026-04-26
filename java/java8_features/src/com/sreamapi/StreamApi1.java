package com.sreamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamApi1 {
	public static void main(String[] args) {
		List<Integer> lis = new ArrayList<Integer>();
		lis.add(10);
		lis.add(12);
		lis.add(13);
		lis.add(14);
		lis.add(15);
		
		//without
		int count=0;
		for(int ele:lis) {
			if(ele%2==0) {
				count++;
			}
		}
		System.out.println("res:"+count);
		//with
		long count2=lis.stream().filter((ele)->ele%2!=0).count();
		System.out.println(count2);
		
		
		
	}

}

package com.array_list;

 import java.util.ArrayList;
public class ArrayList2 {
	public static void main(String[] args) {
		//using generics
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(12);
		int age=10;
		arr1.add(age);
		arr1.add(15);
		System.out.println(arr1);
		int age1 =arr1.get(1);//no need to type cast
		
		int num=30;
		//Integer num2 =num;//Auto boxing
		Integer num2 =Integer.valueOf(num);
		
		//int num3 = num2;//unboxing
		int num3 = num2.intValue();
		
		Byte b=30;
		byte b1 = b.byteValue();
		
	}
	
	

}

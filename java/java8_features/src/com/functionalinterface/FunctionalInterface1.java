package com.functionalinterface;
@FunctionalInterface
interface AddTwoNumbers{
	int add(int a, int b);
	}
/*@FunctionalInterface
interface EvenOrOdd{
	boolean even_odd(int a,int b);
	}

@FunctionalInterface
interface CustomStringLenght{
	int str_len(String str);
	}*/
public class FunctionalInterface1{
	public static void main(String[] args) {
		AddTwoNumbers add_two = (a,b)->a+b;
		int res = add_two.add(12,34);
		System.out.println("Result:"+res);
		//
		
	}

}

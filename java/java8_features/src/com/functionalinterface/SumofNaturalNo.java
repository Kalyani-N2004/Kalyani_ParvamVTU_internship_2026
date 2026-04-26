package com.functionalinterface;

import java.util.function.Function;;

public class SumofNaturalNo {
	public static void main(String[] args) {
		//5->1+2+3+4+5->15
		Function<Integer,Integer>fun = (num)->{
			int res =0;
			for(int i= 1;i<=num;i++) {
				res=res+i;
			}
			return res;
		};
		System.out.println(fun.apply(5));
	}
	

}

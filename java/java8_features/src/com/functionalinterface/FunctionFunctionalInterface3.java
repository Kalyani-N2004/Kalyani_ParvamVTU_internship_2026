package com.functionalinterface;

import java.util.function.Function;;

public class FunctionFunctionalInterface3 {
	public static void main(String[] args) {
		Function<String,Integer>fun = s->s.length();
		int res = fun.apply("Hello world");
		System.out.println("Res:"+res);
	}
	

}

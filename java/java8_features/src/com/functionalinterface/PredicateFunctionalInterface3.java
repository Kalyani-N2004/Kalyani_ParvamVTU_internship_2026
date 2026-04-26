package com.functionalinterface;
import java.util.function.Predicate;
 
public class PredicateFunctionalInterface3{
	public static void main(String[] args) {
		Predicate<Integer>pre = a->a%2==0;
		System.out.println(pre.test(13));
	}

}
//explore on remaining interface
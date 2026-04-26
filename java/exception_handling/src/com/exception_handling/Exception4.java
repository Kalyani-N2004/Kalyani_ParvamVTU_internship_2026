package com.exception_handling;

public class Exception4 {
	public static void main(String[] args) {
		System.out.println("start of program");
		try {
			System.out.println("res:"+(10/0));
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("this is finally block");
		}
}
}


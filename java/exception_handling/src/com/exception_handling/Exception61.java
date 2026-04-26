package com.exception_handling;
public class Exception61 {
	public static void main(String[] args) {
		int age =10;
		try {
			validate(age);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("program compiled");
		}
}
	private static void validate(int age) {
		if(age>=18) {
			System.out.println("your age is valid");
		}else {
			throw new ArithmeticException ("invalid age number");
		}
	}
}

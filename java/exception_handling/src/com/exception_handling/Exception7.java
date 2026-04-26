package com.exception_handling;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class Exception7 {
	private  static void validate(int age) throws InvalidAgeException{
		if(age>=18) {
			System.out.println("your age is valid");
		}else {
			throw new InvalidAgeException("Invalid age number");
		}
		
	}
	public static void main(String[] args) {
		try {
			validate(10);
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	} 
}

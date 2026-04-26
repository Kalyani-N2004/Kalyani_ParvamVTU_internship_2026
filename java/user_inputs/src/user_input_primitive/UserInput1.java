package user_input_primitive;

import java.util.Scanner;

public class UserInput1 {
	public static void main(String[] args) {
		// Scanner --> to take user input values
		// new --> to create object 
		// class_name obj_name = new class_name();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter youe age: ");
		byte age = sc.nextByte();
		System.out.println("Age is : "+age);
		
		System.out.println("Enter marks: ");
		float marks = sc.nextFloat();
		System.out.println("your marks is: "+marks);
		
		System.out.print("Enter Gender: ");
		char gender = sc.next().charAt(0); //male
		System.out.println("gender is: "+gender);
		sc.nextLine();
		System.out.println("Enter Name: ");
//		String  name = sc.next(); // this will take input up to space
		String name = sc.nextLine(); // this  will take input up to  new line and new line 
		System.out.println("Name is: "+name);
	
		sc.close();
	}
}

package com.super_final;

class Person{
	public final void display() {
		System.out.println("parent class display");
	}
	
	
}
class  Student extends Person{
	
	public void display() {
		System.out.println("child class display");
	}
}


public class FinalKeyword {
	public static void main(String[] args) {
		final int age;
		age=30;
		System.out.println("Age:"+age);
		age=40;
		System.out.println("Age:"+age);
		//final int age =30;
		//age=40;
		
		Student s1=new Student();
		s1.display();
		
		}

}

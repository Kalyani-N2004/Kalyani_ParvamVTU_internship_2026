package com.constructor;

class Person1{
	String name;
	int age;
	String email;
	
	Person1(){
		System.out.println("Person1 Constructor");
	}
	
	Person1(String name, int age, String email){
		System.out.println("Person1 args Constructor");
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	Person1(String name, int age){
		System.out.println("Person1 args1 Constructor");
		this.name = name;
		this.age = age;
	}
	
	Person1(String name){
		System.out.println("Person1 args1 Constructor");
		this.name = name;
	}
	
	
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Email: "+this.email);
	}
}


public class ArgsConstructor {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.display();
		Person1 p2 = new Person1("pavan",23, "pavan.parvam@gmail.com");
		p2.display();
		Person1 p3 = new Person1("mohan",25);
		p3.display();
		Person1 p4 = new Person1("mohan123");
		p4.display();
	}
}

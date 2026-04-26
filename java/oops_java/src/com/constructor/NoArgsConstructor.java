package com.constructor;

class Employee{
	String name;
	int age;
	Employee(){
		System.out.println("Emp Contructor");
	}
}

public class NoArgsConstructor {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name="pavan";
		emp1.age=24;
		System.out.println("Name: "+emp1.name);
		System.out.println("Age: "+emp1.age);
	}
}
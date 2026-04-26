package com.class_object;

class Car{
	//properties
	String name="Tesla";
	long price=10000;
	//behaviour
	public void canDrive() {
		System.out.println("yes");
	}
}

public class Introduction {
	public static void main(String[] args) {
	/*
	 * oops:object oriented prg system
	 * 
	 * topics
	 * =======
	 * 1.class and object
	 * 2.inheritance
	 * 3.polymorphism
	 * 4.encapsulation
	 * 5.abstraction
	 * 6.interface
	 * class=it will represent the state and behaviour of an object.
	 * state-properties of an object-variables
	 * behaviour-actions of an object-function/methods
	 * syntax:
	 * access_modifier class_Name{
	 *properties
	 *behaviour
	 *object-is the implementation of the class.
	 *class will not take the memory object takes the memory
	 * it uses new keyword
	 *syntax:
	 *class_name obj_name=new class_name();
	 *
	 *
	 *acccess modifiers:
	 *private-within the class only
	 *default or package private-same package
	 *protected-same package+subclass(child)of any package.
	 *public-anywhere
	 *
	 *
	 */
     Car c=new Car();
     System.out.println("Name:" +c.name);
     System.out.println("Price:" +c.price);
     c.canDrive();
}
}
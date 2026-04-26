package com.super_final;

class Car{
	String name;
	static int noWheels=4;
	
	public static  void display() {
		//System.out.println("name:"+this.name);
		System.out.println("No Wheels:"+Car.noWheels);
		
	}
	
}
public class StaticKeyword {
	public static void main(String[] args) {
		Car c=new Car();
		c.name="Tesla";
		//c.display();
		Car.display();
		Car c1 = new Car();
		c1.name="XYZ";
		Car.display();
		
	}

}

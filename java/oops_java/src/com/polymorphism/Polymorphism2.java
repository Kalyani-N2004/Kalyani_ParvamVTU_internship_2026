package com.polymorphism;

class Shape{
	public void area() {
		System.out.println("calculating area...");
	}
}

class Circle extends Shape{
	private int r;
	
	public Circle(int r) {
		super();
		this.r = r;
	}
	
	@Override
	public void area() {
		System.out.println("result = "+(3.14*this.r*r));
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		Shape s1 = new Circle(2);
		s1.area();
	}
}
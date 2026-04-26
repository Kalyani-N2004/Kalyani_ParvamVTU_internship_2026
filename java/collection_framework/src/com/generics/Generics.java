package com.generics;
class MyGenericsClass<T>{
	private T variable;
	
	public MyGenericsClass(T variable) {
		this.variable =variable;
	}
	
	public T getVariable() {
		return variable;
	}
	public void setVariable(T variable) {
		this.variable = variable;
	}
}
public class Generics{
	public static void main(String[] args) {
		MyGenericsClass<Integer> obj1 =new MyGenericsClass<>(21);
		System.out.println("value:"+obj1.getVariable());
		obj1.setVariable(40);
		System.out.println("value2:"+obj1.getVariable());
		
		MyGenericsClass<String> obj2 =new MyGenericsClass<>("Hello");
		System.out.println("value;"+obj2.getVariable());
		
		
	}
}


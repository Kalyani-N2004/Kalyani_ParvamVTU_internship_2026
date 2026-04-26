package com.functionalinterface;
@FunctionalInterface
interface MyInterface{
	void display();
}
//class First implements MyInterface{
//Override
//public void display(){
//System.out.println("hello world");
//}
//}
public class FunctionalInterface2{
	public static void main(String[] args) {
		MyInterface i = ()->{System.out.println("hello world");};
		i.display();
	}

}

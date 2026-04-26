package com.methodreference;

import java.util.function.Consumer;

public class StaticMethodReference {
	 public static void printMessage(String message) {
		 System.out.println("your message is :"+message);
	 }
	public static void main(String[] args) {
		//without StaticMethodReference
		Consumer<String>cons1=s->StaticMethodReference.printMessage(s);
		cons1.accept("hello world");
		//with StaticMethodReference
		Consumer<String>cons2=StaticMethodReference::printMessage;
		cons2.accept("hello world");
	}
}


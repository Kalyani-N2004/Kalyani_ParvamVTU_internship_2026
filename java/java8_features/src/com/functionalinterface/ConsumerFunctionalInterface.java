package com.functionalinterface;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
	public static void main(String[] args) {
		Consumer<String> con = s->System.out.println(s.length());
		con.accept("hello world");
	}
	

}

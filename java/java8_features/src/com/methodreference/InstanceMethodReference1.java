package com.methodreference;

import java.util.function.Supplier;

public class InstanceMethodReference1 {
	public String getMessage() {
		return "Instance Method";
	}
	public static void main(String[] args) {
		InstanceMethodReference1 obj1 = new InstanceMethodReference1();
		Supplier<String>sup=()->obj1.getMessage();
		System.out.println("Res:"+sup.get());
		Supplier<String>sup2=obj1::getMessage;
		System.out.println("Res2:"+sup.get());
	}
}


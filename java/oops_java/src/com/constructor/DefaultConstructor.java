package com.constructor;

class Person {
    String name = "mohan";
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("Name: " + p1.name);
    }
}
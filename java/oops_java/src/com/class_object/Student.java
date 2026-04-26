package com.class_object;
 import java.util.Scanner;
public class Student {
	String std_name;
	int std_rollno;
	int std_totalmarks;

	public String isStudying() {
		return"yes she is studying";
	}
	
	public static void main(String[] args) {
		Student std=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name:");
		std.std_name=sc.nextLine();
		System.out.println("enter student rollno:");
		std.std_rollno=sc.nextInt();
		System.out.println("enter student total marks:");
		std.std_totalmarks=sc.nextInt();
		
		
		//std.std_name="kalyani";
		//std.std_rollno=123;
		//std.std_totalmarks=550;
		String res=std.isStudying();
		System.out.println("std_name:"+std.std_name);
		System.out.println("std_rollno:"+std.std_rollno);
		System.out.println("std_totalmarks:"+std.std_totalmarks);
		System.out.println(res);
		
		Student std1=new Student();
		std1.std_name="manasa";
		std1.std_rollno=125;
		std1.std_totalmarks=558;
		String res1=std.isStudying();
		System.out.println("std_name:"+std1.std_name);
		System.out.println("std_rollno:"+std1.std_rollno);
		System.out.println("std_totalmarks:"+std1.std_totalmarks);
		System.out.println(res1);
		
	}
}

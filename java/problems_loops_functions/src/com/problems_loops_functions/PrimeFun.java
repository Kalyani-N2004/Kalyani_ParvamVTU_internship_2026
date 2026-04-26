package com.problems_loops_functions;

import java.util.Scanner;

public class PrimeFun {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		prime(num);
	}
	public static void prime(int num) {
		boolean flag =true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
			}
		}
		if(flag)
			System.out.println("prime Number");
		else
			System.out.println("not a prime number");
	}
	}



package com.prctice_questions1;
import java.util.Scanner;

public class PowerNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter base:");
		int base=sc.nextInt();
		
		System.out.println("enter power:");
		int power=sc.nextInt();
		
		int result=1;
		
		for(int i=1;i<=power;i++) {
			result*=base;
		}
		
		System.out.println("result:"+result);
	}
}
package com.prctice_questions1;
import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0;
		
		while(temp>0) {
			int d=temp%10;
			sum+=d*d*d;
			temp/=10;
		}
		
		if(sum==num) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
	}
}
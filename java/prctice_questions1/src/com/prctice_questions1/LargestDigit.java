package com.prctice_questions1;
import java.util.Scanner;

public class LargestDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		int max=0;
		
		while(num>0) {
			int d=num%10;
			
			if(d>max) {
				max=d;
			}
			
			num/=10;
		}
		
		System.out.println("largest digit:"+max);
	}
}
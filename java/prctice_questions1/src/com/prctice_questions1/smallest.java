package com.prctice_questions1;
import java.util.Scanner;

public class smallest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		int min=9;
		
		while(num>0) {
			int d=num%10;
			
			if(d<min) {
				min=d;
			}
			
			num/=10;
		}
		
		System.out.println("smallest digit:"+min);
	}
}
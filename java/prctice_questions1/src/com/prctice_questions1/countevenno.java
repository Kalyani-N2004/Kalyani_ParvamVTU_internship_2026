package com.prctice_questions1;
import java.util.Scanner;

public class countevenno {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		int count=0;
		
		while(num>0) {
			int d=num%10;
			
			if(d%2==0) {
				count++;
			}
			
			num/=10;
		}
		
		System.out.println("even digits:"+count);
	}
}
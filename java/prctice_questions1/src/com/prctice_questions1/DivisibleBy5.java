package com.prctice_questions1;
import java.util.Scanner;

public class DivisibleBy5 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}
}
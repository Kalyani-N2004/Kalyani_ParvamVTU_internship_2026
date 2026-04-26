package com.prctice_questions1;

import java.util.Scanner;

public class Productofdigits {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int product=1;
		while(num>0){
		    product*=num%10;
		    num/=10;
		}
		System.out.println(product);
	}

}

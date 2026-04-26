package com.problems_loops_functions;

import java.util.Scanner;

public class sumofeven {
	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		int i=2;
		int res=0;
		while(i<=num){
			
			if(i%2==0)
			res=res+i;
			i++;
		}
		System.out.println("result is:" +res);
	}

}

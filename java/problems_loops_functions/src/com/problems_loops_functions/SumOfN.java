package com.problems_loops_functions;

import java.util.Scanner;
public class SumOfN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 1;
		int res = 0;
		while(i<=num) {
			res=res+i;
			i++;
		}
		System.out.println("result is:"+res);
	}

}

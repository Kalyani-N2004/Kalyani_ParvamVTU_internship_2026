package conditional_statements;

import java.util.Scanner;

public class condition1 {
	public static void main(String[] args) {
		/*
		 * conditional statementrs:
		 * =====================
		 * if
		 * else
		 * elseif
		 * switch
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("valid");
			
		}else {
			System.out.println("invalid");
		}
				
	}

}

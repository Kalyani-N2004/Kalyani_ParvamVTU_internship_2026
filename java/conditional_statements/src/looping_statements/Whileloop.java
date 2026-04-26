package looping_statements;

import java.util.Scanner;

public class Whileloop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int count=sc.nextInt();
		int i=1;
		while(i<=count) {
			System.out.println("value:"+i);
			i++;
		}
	}

}

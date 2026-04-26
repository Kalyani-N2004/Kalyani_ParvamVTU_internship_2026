package looping_statements;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		/*
		 * do while loop:
		 * ===========
		 * ini;
		 * do{
		 * 	//code
		 * 	inc/dec
		 * }while(con);
		 * * if you don't the no of iteration and post condition check
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int count = sc.nextInt(); //-1
		int i = 1;
		do{
			System.out.println("Value: "+i);//1
			i++; //2
		}while(i<=count); //2<=-1
		
	}
}

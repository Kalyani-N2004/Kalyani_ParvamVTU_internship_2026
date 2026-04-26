package functions_in_java;

import java.util.Scanner;

public class Functions1 {
	public static void main(String[] args) {
		/*
		 * functions or method:
		 * ====================
		 * * it is a bloack of code used to perform a perticular task
		 * 
		 * two types of functions:
		 * =======================
		 * 1. buitl-in : nextInt(), println();
		 * 2. user defind functions:
		 * =========================
		 * access_modifier return_type fun_name(para){
		 * 	 //code
		 * }
		 * fun_name(args);
		 * 1. (1,0)
		 * 2. (1,1)
		 * 3. (0,1)
		 * 4. (0,0)
		 */
//		Scanner sc = new Scanner(System.in);
		Functions1 fun = new Functions1();
		fun.add(10,20);
		
	}
	//non-static method: to access we should create a object of the class
	public void add(int a, int b) {
		System.out.println("res: "+(a+b));
	}
}

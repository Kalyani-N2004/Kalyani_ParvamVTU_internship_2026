package user_input_primitive;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput2 {
	public static void main(String[] args) {
		//array
		//scanner
		Scanner sc = new Scanner(System.in);
		int marks[]= new int[3];//[20,30,40]
		System.out.println("Enter values: ");
		marks[0] = sc.nextInt();
		marks[1] = sc.nextInt();
		marks[2] = sc.nextInt();
		
		System.out.println("Array: "+Arrays.toString(marks));
	}
}

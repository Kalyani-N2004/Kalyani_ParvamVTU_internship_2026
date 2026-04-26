package task_java;
import java.util.Scanner;
public class typecasting {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Accept integer
	        System.out.print("Enter integer number: ");
	        int number = sc.nextInt();

	        // Implicit Casting (int → double)
	        double d = number;

	        // Explicit Casting (double → int)
	        int n = (int) d;

	        // Display values
	        System.out.println("Original Integer Value: " + number);
	        System.out.println("After Implicit Casting (int to double): " + d);
	        System.out.println("After Explicit Casting (double to int): " + n);

	        sc.close();
	    }
	}


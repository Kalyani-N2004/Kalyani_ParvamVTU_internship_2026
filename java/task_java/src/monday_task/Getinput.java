package monday_task;
import java.util.Scanner;
public class Getinput {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int arr[] = new int[5];

	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < 5; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Array elements:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println(arr[i]);
	        }
	    }
	}


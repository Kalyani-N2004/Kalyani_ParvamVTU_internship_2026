package arrays_java;
import java.util.Scanner;
public class maximum {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();

	        int arr[] = new int[n];

	        System.out.println("Enter elements:");
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Assume first element is maximum
	        int max = arr[0];

	        // Compare with remaining elements
	        for(int i = 1; i < n; i++) {
	            if(arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("Maximum element = " + max);
	    }
	}


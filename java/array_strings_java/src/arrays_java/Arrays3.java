package arrays_java;

import java.util.Scanner;

public class Arrays3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int i = 0;

        // Taking input
        while(i <= size - 1) {
            System.out.println("Enter " + i + " element: ");
            arr[i] = sc.nextInt();
            i++;
        }

        // Calculating sum
        int sum = 0;

        for(int j = 0; j <= size - 1; j++) {
            sum = sum + arr[j];
        }
 //how to calculate maximum element in an array
 //how to calculate minimum element in an array
        // Printing result
        System.out.println("Sum of array elements = " + sum);
    }
}
package arrays_java;
 import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the size of an Array: ");
        int size = sc.nextInt(); //3
        int arr [] = new int[size];//3-1 = 2
        int i = 0;
        while(i<=size-1) {//3<=2
            System.out.println("Enter "+ i +" element: ");
            arr[i]= sc.nextInt();
            i++;
        }
        //print
        //for(int j = 0;j<=size-1;j++) {
            //System.out.print(arr[j]+ " ");
            
            
       // }
        for(int element:arr ) {
        	System.out.print(element+"");
        }
    }
}

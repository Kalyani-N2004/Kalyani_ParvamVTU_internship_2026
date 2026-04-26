package arrays_java;

import java.util.Arrays;

public class array5 {
    public static void main(String[] args) {
        // In java we store multiple data type value in an array or not.
        // --> it is possible using Object class.
        
        Object arr[] = new Object[4];
        
        arr[0] = 12;
        arr[1] = "pavan";
        arr[2] = 'M';
        arr[3] = 345.6;
        
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
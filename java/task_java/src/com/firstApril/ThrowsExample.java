package com.firstApril;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class ThrowsExample {
    
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }

    // Method declares it may throw exception
    static void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("abc.txt");
    }
}
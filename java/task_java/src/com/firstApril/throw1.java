package com.firstApril;

public class throw1 {
	    public static void main(String[] args) {
	        int marks = -10;

	        if (marks < 0) {
	            // Throwing a built-in exception manually
	            throw new IllegalArgumentException("Marks cannot be negative");
	        }

			System.out.println("Valid marks");
		}

	}

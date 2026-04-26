package com.exception_handling;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class Exception1 {
	public static void main(String[] args)throws FileNotFoundException{
		try {
			PrintWriter pw = new PrintWriter("hello.txt");
			pw.write("hello world");
			System.out.println("completed");
			pw.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
			
		}
		
		//2nd way
		PrintWriter pw = new PrintWriter("world.txt");
		pw.write("hello world");
		System.out.println("completed1");
		pw.close();
		
		//throw and throws keyword;
		//custom exception class;
	
	}
}

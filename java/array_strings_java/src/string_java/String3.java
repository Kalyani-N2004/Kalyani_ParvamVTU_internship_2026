package string_java;

public class String3 {
	public static void main(String[] args) {
		/* 
		 * Strings in java are immutable
		 * once we create string we can't able to change the value of it
		 * to overcome this problem
		 * 1. string buffer
		 * 2. string builder
		 */

		String str1 = "Hello"; 
		System.out.println("Before: "+str1);
		str1 = str1.concat(" World");
		System.out.println("After: "+str1);
	}
}
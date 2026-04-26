package task_java;
import java.util.Scanner;
public class studentgradesystem {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter marks: ");
	        int marks = sc.nextInt();

	        char grade;

	        // if-else-if ladder
	        if (marks >= 90 && marks <= 100) {
	            grade = 'A';
	        } else if (marks >= 75) {
	            grade = 'B';
	        } else if (marks >= 60) {
	            grade = 'C';
	        } else if (marks >= 50) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }

	        System.out.println("Grade: " + grade);

	        // switch statement for description
	        switch (grade) {
	            case 'A':
	                System.out.println("Grade Description: Excellent");
	                break;
	            case 'B':
	                System.out.println("Grade Description: Good");
	                break;
	            case 'C':
	                System.out.println("Grade Description: Average");
	                break;
	            case 'D':
	                System.out.println("Grade Description: Pass");
	                break;
	            default:
	                System.out.println("Grade Description: Fail");
	        }

	        sc.close();
	    }
	}

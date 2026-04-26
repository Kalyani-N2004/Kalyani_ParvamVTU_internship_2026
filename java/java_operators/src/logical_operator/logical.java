package logical_operator;

public class logical {

	    public static void main(String[] args) {

	        int a = 10;
	        int b = 5;

	        System.out.println("(a > b) && (a > 0) : " + ((a > b) && (a > 0)));  // Logical AND
	        System.out.println("(a > b) || (a < 0) : " + ((a > b) || (a < 0)));  // Logical OR
	        System.out.println("!(a > b) : " + !(a > b));                         // Logical NOT
	    }
	}



package thirtyfirst;
import java.util.Queue;
import java.util.LinkedList;


public class Queue1 {
	    public static void main(String[] args) {

	        Queue<String> queue = new LinkedList<>();

	        // Adding elements
	        queue.add("A");
	        queue.add("B");
	        queue.add("C");
	        queue.add("D");

	        System.out.println("Queue: " + queue);

	        // Access first element
	        System.out.println("Peek: " + queue.peek());

	        // Remove element
	        System.out.println("Removed: " + queue.poll());

	        System.out.println("After removal: " + queue);

	        // Iterate using forEach
	        queue.forEach(e -> System.out.println("Element: " + e));
	    }
	}


package thirtyfirst;
import java.util.Deque;
import java.util.ArrayDeque;

public class Dequeue1 {
	    public static void main(String[] args) {

	        Deque<String> deque = new ArrayDeque<>();

	        // Adding elements
	        deque.addFirst("A");
	        deque.addLast("B");
	        deque.addFirst("C");
	        deque.addLast("D");

	        System.out.println("Deque: " + deque);

	        // Access elements
	        System.out.println("First: " + deque.peekFirst());
	        System.out.println("Last: " + deque.peekLast());

	        // Remove elements
	        System.out.println("Removed First: " + deque.pollFirst());
	        System.out.println("Removed Last: " + deque.pollLast());

	        System.out.println("After removal: " + deque);

	        // Iteration
	        for (String s : deque) {
	            System.out.println("Element: " + s);
	        }
	    }
	

}

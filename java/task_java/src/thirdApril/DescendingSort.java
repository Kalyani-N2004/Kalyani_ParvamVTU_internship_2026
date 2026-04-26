package thirdApril;
import java.util.*;
import java.util.stream.Collectors;

public class DescendingSort {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 5, 20, 15);

		List<Integer> result = numbers.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println(result);
	}
}
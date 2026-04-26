package thirdApril;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 5, 10, 20, 5);

		List<Integer> result = numbers.stream()
				.distinct()
				.collect(Collectors.toList());

		System.out.println(result);
	}
}

package thirdApril;

import java.util.*;

public class SumReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 15);

        int sum = list.stream()
                      .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);
    }
}
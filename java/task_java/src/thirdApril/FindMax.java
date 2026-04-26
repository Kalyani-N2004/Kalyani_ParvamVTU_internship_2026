package thirdApril;

import java.util.*;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 15);

        int max = list.stream()
                      .max(Integer::compare)
                      .get();

        System.out.println("Max: " + max);
    }
}

package thirdApril;

import java.util.*;

public class AllMatchExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(150, 200, 120);

        boolean result = list.stream()
                             .allMatch(n -> n > 100);

        System.out.println(result);
    }
}
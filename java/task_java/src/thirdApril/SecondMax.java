package thirdApril;

import java.util.*;

public class SecondMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 15, 20);

        int secondMax = list.stream()
                            .distinct()
                            .sorted(Comparator.reverseOrder())
                            .skip(1)
                            .findFirst()
                            .get();

        System.out.println("Second Max: " + secondMax);
    }
}
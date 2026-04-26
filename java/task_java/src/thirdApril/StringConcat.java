package thirdApril;

import java.util.*;

public class StringConcat {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", " ", "Kalyani");

        String result = list.stream()
                            .reduce("", (a, b) -> a + b);

        System.out.println(result);
    }
}
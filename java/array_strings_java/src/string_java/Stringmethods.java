package string_java;
public class Stringmethods {
    public static void main(String[] args) {

        String str = "  Hello World  ";
        String str2 = "hello world";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. trim()
        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed);

        // 3. toLowerCase()
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // 4. toUpperCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());

        // 5. charAt()
        System.out.println("Character at index 1: " + trimmed.charAt(1));

        // 6. substring()
        System.out.println("Substring (0-5): " + trimmed.substring(0, 5));

        // 7. contains()
        System.out.println("Contains 'World': " + trimmed.contains("World"));

        // 8. equals()
        System.out.println("Equals str2: " + trimmed.equals(str2));

        // 9. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + trimmed.equalsIgnoreCase(str2));

        // 10. compareTo()
        System.out.println("CompareTo: " + trimmed.compareTo(str2));

        // 11. indexOf()
        System.out.println("Index of 'o': " + trimmed.indexOf('o'));

        // 12. lastIndexOf()
        System.out.println("Last index of 'o': " + trimmed.lastIndexOf('o'));

        // 13. replace()
        System.out.println("Replace World with Java: " + trimmed.replace("World", "Java"));

        // 14. startsWith()
        System.out.println("Starts with Hello: " + trimmed.startsWith("Hello"));

        // 15. endsWith()
        System.out.println("Ends with World: " + trimmed.endsWith("World"));

        // 16. split()
        String[] words = trimmed.split(" ");
        System.out.println("Split words:");
        for(String word : words) {
            System.out.println(word);
        }

        // 17. isEmpty()
        String emptyStr = "";
        System.out.println("Is empty: " + emptyStr.isEmpty());

        // 18. concat()
        System.out.println("Concat: " + trimmed.concat(" Java"));

        // 19. valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf: " + numStr);

        // 20. join()
        String joined = String.join("-", "A", "B", "C");
        System.out.println("Join: " + joined);
    }
}
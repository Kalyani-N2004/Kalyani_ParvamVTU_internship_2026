package string_java;

public class Strings1 {
    public static void main(String[] args) {
        /*
         * String:
         * in java string is Object,it is a collection of characters, ""
         * syntax:
         * 1. string literal : it will store in string constant pool (scp)
         *    String str_name = "value";
         * 2. using new : it will store in heap memory
         *    String str_name = new String("value");
         */

        String str1 = "Hello"; //scp
        String str2 = new String("Hello"); //heap
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
    }
}